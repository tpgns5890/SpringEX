<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원수정</h3>
<form action="./update" method="post">
<ul>
	<li>employeeId<input name="employeeId" readonly="readonly" value="${emp.employeeId}">
	<li>firstName<input name="firstName" value="${emp.firstName }">
	<li>lastName<input name="lastName" value="${emp.lastName }">
	<li>email<input name="email" value="${emp.email }">
	<li>departmentId<input name="departmentId" value="${emp.departmentId }">
	<li>hireDate<input type="date" name="hireDate" value="${emp.hireDate }">
	<li>jobId<input name="jobId" value="${emp.jobId }">
	<li><button>등록</button>
</ul>
</form>
</body>
</html>