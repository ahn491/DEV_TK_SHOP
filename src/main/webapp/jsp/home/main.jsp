<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>

<script>
		// 회원가입 페이지 이동
	function move_library() {
		location.href = '${pageContext.request.contextPath}/library/library_main.do';
	}
	function move_moive() {
		location.href = '${pageContext.request.contextPath}/movie/movie_main.do';
	}
		
</script>
<body>
	<h1 style = "text-align : center">저희 쇼핑몰에 오신 것을 환영합니다!</h1>

	<div class="modal_footer">
		<button type="button" class="btn_register" onclick="move_library();">도서관</button>
	</div>
	<div class="modal_footer">
		<button type="button" class="btn_register" onclick="move_moive();">영화</button>
	</div>
</body>
</html>