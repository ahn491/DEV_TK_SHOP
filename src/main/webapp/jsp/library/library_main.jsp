<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>

<script>
		
	//회원가입 페이지 이동
	function move_insert() {
		//도서관 페이지로 이동 (이웅주)
		location.href = '${pageContext.request.contextPath}/library/move_insert.do';
	}
</script>
<body>
	<h1 style = "text-align : center">심연의 군주여 이제 예언은 완성되었다</h1>
	
	<div class="modal_footer">
		<button type="button" class="btn_register" onclick="move_insert();">도서등록</button>
	</div>

</body>
</html>