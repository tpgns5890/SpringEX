<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>RESTful 웹서비스 클라이언트(JSON)</title>
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="./resources/json.min.js"></script>


<script type="text/javascript">

let path= '${pageContext.request.contextPath}';

$(function(){
	userList();
	userDelete();
	userSelect();
	userUpdate();
	userInsert();
	
	function userInsert(){
		$("#btnInsert").on("click", function(){
			$.ajax({
				url: path + '/users',
				method: "post",
				data: $("#form1").serialize(), //Controller에 @RequestBody가 없을때는 stringify, contextType 필요 없음
			}).then(res=>{
				alert("등록완료!");
				$("tbody").append(makeTr(res));
				$('[name="id"]').val('');
				$('[name="password"]').val('');
				$('[name="name"]').val('');
				$('[name="role"]').val('');
			})
		})
	}
	
	function userUpdate(){
		$("#btnUpdate").on("click", function(){
			let id = $('[name=id]').val();
			let tr = $('[data-id='+id+']');
			$.ajax({
				url: path + '/users',
				method: "put",
				data: JSON.stringify($("#form1").serializeObject()),
				contentType: "application/json"
			}).then(res=>{
				alert("수정완료!");
				tr.replaceWith(makeTr(res));
				$('[name="id"]').val('');
				$('[name="password"]').val('');
				$('[name="name"]').val('');
				$('[name="role"]').val('');
			})
		})
	}
	
	function userSelect(){
		$("tbody").on("click", "#btnSelect", function(){
			let id = $(this).closest("tr").data("id")
			$.ajax({
				url: path + '/users/' + encodeURIComponent(id),
				method: "get"
			}).then(res=>{
				$('[name="id"]').val(res.id).attr("readonly", "readonly")
				$('[name="password"]').val(res.password)
				$('[name="name"]').val(res.name)
				$('[name="role"]').val(res.role)
			})
		})
	}
	
	function userDelete(){
		$("tbody").on("click", "#btnDelete", function(){
			let tr = $(this).closest("tr");
			let id = $(this).closest("tr").data("id")
			$.ajax({
				url: path+'/users/'+id,
				method:"delete"
				//data:
				//contentType:
			}).then(res=>{
				alert("삭제완료")
				tr.remove();
			})
		})
	}
	
	function userList(){
		$.ajax({
			url: path+'/users'
			//method:
			//data:
			//dataType:
			//contentType:
		}).then(res=>{
			/*for(user of res){
				$("<tr>").append($("<td>").html(user.id))
						 .append($("<td>").html(user.password))
						 .append($("<td>").html(user.name))
					 	 .append($("<td>").html(user.role))
					 	 .appendTo("tbody");
			}*/
			for(user of res){
			$("tbody").append(makeTr(user));
			}
		})
	}
	
	function makeTr(user){
		let tag = `<tr data-id="\${user.id}">
			<td>\${user.id}</td>
			<td>\${user.password}</td>
			<td>\${user.name}</td>
			<td>\${user.role}</td>
			<td><button type="button" id="btnDelete">삭제</button>
			<td><button type="button" id="btnSelect">조회</button>
			</tr>`;
		return tag;
	}
})
</script>
</head>
<body>
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>사용자 등록 및 수정</h2>
			<div class="form-group">
				<label>아이디:</label> <input type="text" class="form-control"
					name="id">
			</div>
			<div class="form-group">
				<label>이름:</label> <input type="text" class="form-control"
					name="name">
			</div>
			<div class="form-group">
				<label>패스워드:</label> <input type="text" class="form-control"
					name="password">
			</div>
			<!-- 		<div class="form-group">
			<label >성별:</label>
			<div class="radio">
				<label><input type="radio"  name="gender"  value="남">남</label>
			</div>
			<div class="radio">
				<label><input type="radio"  name="gender"  value="여">여</label>
			</div>	
		</div>	 -->
			<div class="form-group">
				<label>역할:</label> <select class="form-control" name="role">
					<option value="Admin">관리자</option>
					<option value="User">사용자</option>
				</select>
			</div>
			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"
					id="btnInsert" /> <input type="button" class="btn btn-primary"
					value="수정" id="btnUpdate" /> <input type="button"
					class="btn btn-primary" value="초기화" id="btnInit" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>사용자 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">아이디</th>
					<th class="text-center">이름</th>
					<th class="text-center">성별</th>
					<th class="text-center">거주지</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>아디</td>
					<td>아디</td>
					<td>아디</td>
					<td>아디</td>
					<td><button type="button" id="btnDelete">삭제</button>
					<td><button type="button" id="btnSelect">조회</button>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>