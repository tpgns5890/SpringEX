<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원조회</h3>
	<ul>
		<li>사번: ${emp.employeeId }
		<li>이름: ${emp.firstName } ${emp.lastName }
		<li>부서: ${emp.departmentId }
		<li>부서명: ${emp.jobId }
		<li>고용: ${emp.hireDate }
	</ul>
	<button id="btnUpdate">사원수정</button>
	<button id="btnDelete">사원삭제</button>

	<script>
		btnUpdate.addEventListener("click", ev=>{
			location.assign('update?id=${emp.employeeId}');
		});
		btnDelete.addEventListener("click", ev=>{
			location.assign('delete?id=${emp.employeeId}');
		});
	</script>
</body>
</html>