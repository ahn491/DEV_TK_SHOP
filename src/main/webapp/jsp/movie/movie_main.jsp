<%@page import="com.oitct.Tkshop.VO.MovieVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화메인 페이지</title>
<% List<MovieVO> list = (List<MovieVO>) request.getAttribute("list");
	System.out.print(list);
	System.out.print(list.get(0).getNum());

%>
</head>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
	border-spacing: 0;
}

td {
	border-bottom: 1px solid black;
	border-collapse: collapse;
	border-spacing: 0;
}

th {
	border-bottom: 3px double black;
	border-collapse: collapse;
	border-spacing: 0;
	background-color: #ddd;
}

td, th {
	border-right: 1px double black;
	padding: 0.2em 0.3em;
}

td:nth-child(1) {
	text-align: center;
}
main {width: fit-content; margin: 0.5em auto;}

tr:hover {
	background-color: #F4FA58;
	cursor: pointer;
}

</style>


<script>
function move_detail(num) 
{
		
}


</script>
<main>
	<h3>게시글 목록</h3>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>이미지</th>
				<th>제목</th>
				<th>작성자</th>
				 <th>글내용</th> 
				<th>날짜</th>
				<th>히트수</th>
			</tr>
		</thead>
		<tbody>
		
		<% for(MovieVO mv : list){
			
			
			 %>
			
			
			
			 <tr onclick="window.location.href='moive_detail.do?no=<%=mv.getNum() %>'">
			<%-- <tr onclick="move_detail(<%=mv.getNum() %>)"> --%>
				<td><%=mv.getNum() %></td> 
				<td><img src="../images/<%=mv.getPic_nm() %>" style="width: 300px; height: 170px;"></td>
				<td><%=mv.getTitle() %></td>
				<td><%=mv.getAuthor() %></td>
				 <td><%=mv.getContents() %></td> 
				<td><%=mv.getDate() %></td>
				<td><%=mv.getHitNum() %></td>
			</tr>
		<%} %>
			
		</tbody>






	</table>
</main>

</body>
</html>
</html>