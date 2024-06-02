<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "kor">
<head>
	<meta charset="UTF-8">
	<meta name = "viewport" content = "width = device-width, initial-scale = 1.0">
	<title>로그인 페이지</title>
	<style>
		.modal {
			position : fixed;
			
			justify-content : center;
			top : 25%;
			left : 25%;
			
			width : 50%;
			height : 50%;
			
			background-color : rgba(0, 128, 128, 128);
		}
	</style>
</head>
<body>
	<div class = "modal">
		<div class = "modal_body">
			<h2 align = "center">로그인</h2>
			<h2>ID : <input type = "text" class = "login_id"></h2>
			<h2>PW : <input type = "password" class = "login_pw"></h2>
		</div>
		
		<div class = "modal_footer">
			<!--<button type = "button" class = "btn_login", onclick = "location.href = 'main.jsp'">로그인</button><!--로그인 버튼(클릭 시 메인 페이지로 이동) -->
			<!--<button type = "button" class = "btn_register", onclick = "location.href = 'register.jsp'">회원가입</button><!-- 회원가입 버튼(클릭 시 회원가입 페이지로 이동) -->
			
			<button type = "button" class = "btn_login" onclick="javascript:location.href='${contextPath}/member/main_page.do'">로그인</button><!-- 로그인 버튼(클릭 시 메인 페이지로 이동) -->
			<button type = "button" class = "btn_register" onclick = "location.href = '${contextPath}/member/register.do'">회원가입</button><!-- 회원가입 버튼(클릭 시 회원가입 페이지로 이동) -->
		</div>
	</div>
</body>
</html>

