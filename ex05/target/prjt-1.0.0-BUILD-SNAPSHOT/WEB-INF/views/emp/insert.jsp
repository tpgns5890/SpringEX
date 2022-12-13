<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./insert" method="post">
		성:<input name="firstName">
		이름:<input name="lastName">
		메일:<input name="email">
		고용일:<input type="date" name="hireDate">
		<!-- 참조키: select, radio, checkbox -->
		부서:<select name="jobId">
		<c:forEach items="${jobs }" var="job">
			<option value="${job.jobId }">${job.jobTitle }
		</c:forEach>
		</select>
		부서번호:<input name="departmentId">
		<button>등록</button>
	</form>
	
</body>
</html>