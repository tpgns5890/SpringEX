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
	
	function ReplyList(){
		$.ajax({
			url:path + '/replys/${board.bno }'
		}).then(res=>{
			for(reply of res){
				$("tbody").append(makeTr(reply));
			}
		})
	}
	
	function makeTr(reply){
		let tag = `<tr data-id="\${reply.rno}">
						<td>\${reply.replyer}</td>
						<td>\${reply.replyDate}</td>
						<td>\${reply.reply}</td>
						<td><button type="button" id="btnUpdate">수정</button>
						<td><button type="button" id="btnDelete">삭제</button>
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
	<table class="table text-center">
		<thead>
			<tr>
				<th class="text-center">작성자</th>
				<th class="text-center">작성일자</th>
				<th class="text-center">내용</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>아디</td>
				<td>아디</td>
				<td>아디</td>
				<td><button type="button" id="btnUpdate">수정</button>
				<td><button type="button" id="btnDelete">삭제</button>
			</tr>
		</tbody>
	</table>
</body>
</html>