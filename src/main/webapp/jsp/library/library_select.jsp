<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
<title>도서조회</title>
<script type="text/javascript">

	function movie_select() {
	
		var form = document.movie_list;
		var formdata = new FormData();
		
		$.ajax({
			url  : 'library_select',
			type : 'POST',
			dataType: 'json',
			processData : false,
		    contentType : false,
		    cache: false,
			success : function(res) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
				
				var tblresult = res.movielist;
				var str = "";
				
				for(let i=0; i < tblresult.length; i++) {
					//VO AUTO 젠할때에 소문자로 리턴이 되기때문에 jsp 페이지에서는 소문자로 for문에 선언을 해야한다
					str +='<tr>';
					str +='<td>' + tblresult[i].upper_idx + '</td>';
					str +='<td>' + tblresult[i].title + '</td>';
					str +='<td>' + tblresult[i].contents + '</td>';
					str +='<td>' + tblresult[i].create_date + '</td>';
					str +='<td>' + tblresult[i].create_id +'</td>';
					str +='</tr>';
				}
				
				document.getElementById('movie_list').innerHTML = str; //dataset -> html 입력부 
		},
			error : function(XMLHttpRequest, textStatus, errorThrown) { 
				// 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
				alert("통신 실패.");
				}
		});
		
}
	
</script>
</head>
<body>
<div class="page-wrapper">
    <div class="container-fluid">
        <div class="col-lg-8">
            <div class="col-lg-12">
                <h1 class="page-header">도서조회</h1>
            </div>
            <div class="row">
                  <div class="col-lg-12">
                      <button type="button" class="btn btn-outline btn-primary pull-right" onclick="movie_select();">
                          <i class="fa fa-edit fa-fw"></i> 도서조회
                      </button>
                  </div>
              </div>
            <div class="panel panel-default">
                <div class="panel-heading">공지사항 </div>
                <div class="panel-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Book_ID</th>
                                <th>도서제목</th>
                                <th>산출가격</th>
                                <th>출판사</th>
                                <th>출간</th>
                                <th>총페이지</th>
                                <th>상세 정보</th>
                                <th>책 분류</th>
                                <th>재 고수</th>
                            </tr>
                        </thead>
                        <tbody id ="movie_list" name = "movie_list" >
                           <c:forEach var="jsp_movie_list" items="${movie_list}">
                           <!--c:forEach 자체가 for문임 그러므로 데이터값이 있으면 자동으로 tr td생성함 -->
                            <tr>
                               <!-- <td>${jsp_movie_list.UPPER_IDX}</td> -->
                                <td>${jsp_movie_list.TITLE}</td>
                                <td>${jsp_movie_list.CONTENTS}</td>
                                <td>${jsp_movie_list.CREATE_DATE}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                                <td>${jsp_movie_list.CREATE_ID}</td>
                            </tr>
                          </c:forEach>  
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>