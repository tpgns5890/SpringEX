<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
$(function(){
	//버튼 클릭: 텍스트필드 입력값을 li태그 생성해서 추가
	$('button').on("click", function(){
		let txt = $('#inTxt').val()
		$('#list').append($('<li/>').text(txt));
		txt = ' ';
	})
	
	$('#list').on("click",'li', function(){
		console.log('ge')
		$(this).css('background-color','blue');
	})
})
</script>
</head>
<body>
<input id="inTxt"><button type="button">등록</button>
<ul id="list">
</ul>
</body>
</html>