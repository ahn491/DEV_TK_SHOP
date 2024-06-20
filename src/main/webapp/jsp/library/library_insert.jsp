<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="Stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

<title>도서 등록</title>

<script type="text/javascript">
	
	function book_insert() { //도서입력 
		
		var form = document.library_insert;
		let formData = new FormData(form);
		
		var bookId = form.bookId.value; //도서코드
		var bookname = form.bookname.value; //도서명
		var unitPrice = form.author.value; //가격
		var author = form.author.value; //저자
		var publisher = form.publisher.value; //출판사
		var releaseDate = form.releaseDate.value; //출판일
		var totalPages = form.totalPages.value; //총페이지
		var description = form.description.value; //상세정보
		var category = form.category.value; //분류
		var unitsInStock = form.unitsInStock.value; //재고수
		var situation = form.New.value; //상태
		
		$.ajax({
		       url : 'book_insert',  // 컨트롤러에서 대기중인 URL 주소이다.
		       type: 'POST',    // HTTP method type(GET, POST) 형식이다.
		       data : formData,
		       dataType: 'json',
		       processData : false,
		       contentType : false,
		       cache: false,
		       success : function(res) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
		    	   if(res.result == 1) {
		    	   		alert("저장이 완료되었습니다");
		    	   } else {
		    		   alert("저장이 되지않았습니다");
		    	   }
		    	   location.reload(true);
		       },
		       error : function(request,status,error){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
		           alert("개소문이 이놈!");
		       }
		   });
		//location.reload(true);
	}
</script>

</head>
<body>
	<%-- <jsp:include page="menu.jsp" /> --%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">도서 등록</h1>
		</div>
	</div>
	<div class="container">
		<form id="library_insert" name="library_insert" class="form-horizontal"> <!-- form은 id가 아닌 name 값으로 var 을 인식함  -->
			<div class="form-group row">
				<label class="col-sm-2">도서코드</label>
				<div class="col-sm-3">
					<input type="text" name="bookId" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">도서명</label>
				<div class="col-sm-3">
					<input type="text" name="bookname" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" name="unitPrice" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">저자</label>
				<div class="col-sm-3">
					<input type="text" name="author" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">출판사</label>
				<div class="col-sm-3">
					<input type="text" name="publisher" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">출판일</label>
				<div class="col-sm-3">
					<input type="text" name="releaseDate" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">총페이지 수</label>
				<div class="col-sm-3">
					<input type="text" name="totalPages" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상세정보</label>
				<div class="col-sm-5">
					<textarea name="description" cols="50" rows="2" class="form-control" placeholder="100자 이상 적어주세요" value=""></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">분류</label>
				<div class="col-sm-3">
					<input type="text" name="category" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">재고수</label>
				<div class="col-sm-3">
					<input type="text" id="unitsInStock" name="unitsInStock" class="form-control" value="">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상태</label>
				<div class="col-sm-5">
					<input type="radio" id= "New" name="condition" value="New">신규도서
					<input type="radio" id= "Old" name="condition" value="Old">중고도서
					<input type="radio" id= "EBook" name="condition" value="EBook">E-Book
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<input type="button" class="btn btn-primary" onclick="book_insert();" value="등록">
				</div>
			</div>
		</form>
	</div>
</body>
</html>