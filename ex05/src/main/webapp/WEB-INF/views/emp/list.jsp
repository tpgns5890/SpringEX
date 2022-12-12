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
	<script>
		$(function() {
			let result = '${result}';
			if (result) {
				$(".modal-body").html(result);
				$("#exampleModal").modal('show');
			}
		})
	</script>
	<div>결과 : ${result }</div>
	<h1>사원목록</h1>
	<a href="${pageContext.request.contextPath }/emp/insert">등록</a>
	<ul>
		<li>사번
		<li>이름
		<li>부서
		<li>부서명
		<li>고용일
	</ul>
	<c:forEach items="${emps}" var="emp">
		<ul>
			<li><a href="./select?id=${emp.employeeId }">사번:
					${emp.employeeId }</a></li>
			<li><a
				href="${pageContext.request.contextPath }/emp/select?id=${emp.employeeId }">이름:
					${emp.firstName } ${emp.lastName }</a></li>
			<li>부서: ${emp.departmentId }</li>
			<li>부서명: ${emp.jobId }</li>
			<li>고용: ${emp.hireDate }</li>
		</ul>
	</c:forEach>
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">Modal
						title</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>