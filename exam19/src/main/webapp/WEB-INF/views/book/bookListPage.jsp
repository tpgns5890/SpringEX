<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- <script type="text/javascript">
let path = '${pageContext.request.contextPath}';
$(function(){
	BookList();
	function BookList(){
		$.ajax({
			url:path+'/books'
		}).then(res=>{
			for(book of res){
				$("tbody").append(makeTr(book));
			}
		})
	}
	
	function makeTr(book){
		let tag = `<tr>
						<td>\${book.bookNo}</td>
						<td>\${book.bookName}</td>
						<td>\${book.bookCoverimg}</td>
						<td>\${book.bookDate}</td>
						<td>\${book.bookPrice}</td>
						<td>\${book.bookPublisher}</td>
						<td>\${book.bookInfo}</td>
					</tr>`;
		return tag;
	}
})
</script> -->
</head>
<body>
<h3>도서 조회/수정</h3>
<table>
	<thead>
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>표지</th>
			<th>출판일자</th>
			<th>금액</th>
			<th>출판사</th>
			<th>도서소개</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${books }" var="book" varStatus="st">
			<tr>
				<td>${book.bookNo}</td>
				<td>${book.bookName}</td>
				<td>${book.bookCoverimg}</td>
				<td>${book.bookDate}</td>
				<td>${book.bookPrice}</td>
				<td>${book.bookPublisher}</td>
				<td>${book.bookInfo}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>