<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>


<script type="text/javascript">
let path = '${pageContext.request.contextPath}';
$(function(){
	ReplyList();
	ReplyInsert();
	ReplyUpdate();
	ReplySelect();
	ReplyDelete();
	
	function ReplyList(){
		$.ajax({
			url:path + '/replys/${board.bno }'
		}).then(res=>{
			for(reply of res){
				$("tbody").append(makeTr(reply));
				$("#btnInsert").css('display','');
				$("#btnUpdate").css('display','none');
			}
		})
	}
	function ReplyInsert(){
		$("#btnInsert").on("click", function(){
			$.ajax({
				url:path + '/replys',
				method: "post",
				data: $("#reply-insert-form").serialize()
			}).then(res=>{
				alert("댓글등록완료!");
				$("tbody").prepend(makeTr(res));
				$('[name="replyer"]').val('');
				$('[name="reply"]').val('');
				$("#btnInsert").css('display','');
				$("#btnUpdate").css('display','none');
			})
		})
	}
	function ReplyUpdate(){
		$("#btnUpdate").on("click", function(){
			let id=$('[name=rno]').val();
			let tr = $('[data-id='+id+']');
			$.ajax({
				url:path + '/update',
				method: "post",
				data: $("#reply-insert-form").serialize(),
			}).then(res=>{
				alert("댓글수정완료!");
				tr.replaceWith(makeTr(res));
				$('[name="replyer"]').val('');
				$('[name="reply"]').val('');
				$("#btnInsert").css('display','');
				$("#btnUpdate").css('display','none');
			})
		})
	}
	
	function ReplyDelete(){
		$("tbody").on("click", "#btnDelete", function(){
			let tr = $(this).closest("tr");
			let rno = $(this).val();
			$.ajax({
				url: path+'/replys/'+rno,
				method: "delete"
			}).then(res=>{
				alert("댓글삭제완료")
				tr.remove();
			})
			
		})
	}
	
	function ReplySelect(){
		$("tbody").on("click","#btnSelect", function(){
			let rno = $(this).val();
			$.ajax({
				url:path+ '/reply/' + encodeURIComponent(rno),
				method: "get"
			}).then(res=>{
				$('[name="replyer"]').val(res.replyer).attr("readonly", "readonly");
				$('[name="reply"]').val(res.reply);
				$('[name="bno"]').val(res.bno);
				$('[name="rno"]').val(res.rno);
				$("#btnInsert").css('display','none');
				$("#btnUpdate").css('display','');
			})
		})
	}
	
	function makeTr(reply){
		let tag = `<tr data-id="\${reply.rno}">
						<td>\${reply.replyer}</td>
						<td>\${reply.replyDate}</td>
						<td>\${reply.reply}</td>
						<td><button id="btnSelect" value="\${reply.rno}">수정</button>
						<td><button id="btnDelete" value="\${reply.rno}">삭제</button>
					</tr>`;
		return tag;
	}
})

</script>
</head>
<body>

	<h3>글 상세정보</h3>
	<div>${board.bno }</div>
	<div>${board.title }</div>
	<div>${board.content }</div>
	<div>${board.writer }</div>
	<div>${board.regDate }</div>
	<div>${board.updateDate }</div>
	<hr>
	<h3>댓글</h3>
	<div>
		<form id="reply-insert-form">
			<label>작성자</label><input type="text" name="replyer">
			<label>내용</label><input	type="text" name="reply">
			<input type="hidden" value="${board.bno }" name="bno">
			<input type="hidden" value="" name="rno">
			<button id="btnInsert" >등록</button>
			<button id="btnUpdate" >수정</button>
			<button type="reset">초기화</button>

		</form>
	</div>
	<table>
		<thead>
			<tr>
				<th>작성자</th>
				<th>작성일자</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
</html>