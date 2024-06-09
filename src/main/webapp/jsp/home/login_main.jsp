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
	<form id = "login" action = "${pageContext.request.contextPath}/member/login.do", method = "post">
		<div class = "modal">
			<div class = "modal_body">
				<h2 align = "center">로그인</h2>
				<h2>ID : <input type = "text" id = "login_id" name = "login_id"></h2>
				<h2>PW : <input type = "password" id = "password" name = "password"></h2>
			</div>
		
			<div class = "modal_footer">
				<button type = "submit" class = "btn_login" onclick = "move_main();">로그인</button><!-- 로그인 버튼(클릭 시 메인 페이지로 이동) -->
				<button type = "button" class = "btn_register" onclick = "move_register();">회원가입</button><!-- 회원가입 버튼(클릭 시 회원가입 페이지로 이동) -->
				<!--<button type = "submit">전송</button> --><!-- 로그인 창 입력 정보 전송 버튼 -->
			</div>
		</div>
	</form>
	<script>
		<!-- 메인 페이지 이동 -->
		function move_main() {
			var input_text = document.getElementById('login_id').value;
			var input_pw = document.getElementById('password').value;
			
			<!-- ID TextField Validation Check(빈 값) -->
			if(input_text == "") {
				alert("ID를 입력해주세요.");
				
				return false;
				
			} else if(input_pw == "") { <!-- PW Field Validation Check(빈 값) -->
				alert("비밀번호를 입력해주세요.");
				
				return false;
				
			} else {
				location.href = '${pageContext.request.contextPath}/member/main_page.do'; <!-- 메인 페이지 이동 -->
			}
		}
		
		// 회원가입 페이지 이동
		function move_register() {
			location.href = '${pageContext.request.contextPath}/member/register.do';
		}
	</script>
</body>
</html>

