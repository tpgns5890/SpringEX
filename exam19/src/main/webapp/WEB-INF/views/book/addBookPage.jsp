<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서등록</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="./resources/json.min.js"></script>

<script type="text/javascript">
let path = '${pageContext.request.contextPath}';
$(function(){
	BookInsert();
	
	function BookInsert(){
		$("#btnInsert").on("click", function(){
			if($('[name="bookName"]').val()===''){
				alert("도서명이 입력되지 않았습니다.");
				$('[name="bookName"]').focus();
			}else{
				$.ajax({
					url:path+'/books',
					method: "post",
					data: $("#addBookForm").serialize()
				}).then(res=>{
					if(res>0){
					alert("도서등록이 완료 되었습니다.");
					$('[name="bookNo"]').val('');
					$('[name="bookName"]').val('');
					$('[name="bookCoverimg"]').val('');
					$('[name="bookDate"]').val('');
					$('[name="bookPrice"]').val('');
					$('[name="bookPublisher"]').val('');
					$('[name="bookInfo"]').val('');
					}else{
						alert("도서등록에 실패하였습니다.")
					}
					
				})
			}
		})
	}
})
</script>
</head>
<body>
	<h3>도서등록</h3>
	<form id="addBookForm">
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="number" name="bookNo"></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCoverimg"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="date" name="bookDate"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="number" name="bookPrice"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="button" id="btnInsert">등록</button>
	</form>
</body>
</html>