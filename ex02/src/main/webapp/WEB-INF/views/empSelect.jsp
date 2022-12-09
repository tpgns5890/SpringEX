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
<form>
	부서<input name="departmentId" value="${empVO.departmentId}">
	firstName: <input name="firstName" value="${empVO.firstName}">
	<button>검색</button>
</form>
	<table>
	<tr><th>employeeId</th><th>firstName</th><th>lastName</th></tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td>${emp.employeeId }</td>
				<td>${emp.firstName }</td>
				<td>${emp.lastName }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>