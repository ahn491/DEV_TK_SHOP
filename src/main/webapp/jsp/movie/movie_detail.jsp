<%@page import="com.oitct.Tkshop.VO.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>영화 상세 정보</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            font-weight: bold;
            margin-bottom: 5px;
            display: block;
        }
        .form-group input[type="text"], .form-group textarea {
            width: calc(100% - 20px);
            padding: 10px;
            font-size: 16px;
            border: 1px solid #cccccc;
            border-radius: 4px;
        }
        .btn-container {
            text-align: center;
            margin-top: 20px;
        }
        .btn {
            padding: 10px 20px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
    <script>
        function enableEdit() {
            var inputs = document.querySelectorAll('.form-group input[type="text"], .form-group textarea');
            inputs.forEach(function(input) {
                input.removeAttribute('readonly');
            });
        }
    </script>
    <% MovieVO movie =(MovieVO) request.getAttribute("mv"); %>
</head>
<body>

<div class="container">
    <h2>영화 상세 정보</h2>
    
    <div class="form-group">
        <img alt="" width="300" height="170" src="../images/${mv.pic_nm}">
    </div>
    
    
    <div class="form-group">
        <label>번호</label>
        <input type="text" value="${mv.num}" readonly>
    </div>
    <div class="form-group">
        <label>제목</label>
        <input type="text" value="${mv.title}" readonly>
    </div>
    <div class="form-group">
        <label>작성자</label>
        <input type="text" value="${mv.author}" readonly>
    </div>
    <div class="form-group">
        <label>내용</label>
        <textarea rows="4" readonly>${mv.contents}</textarea>
    </div>
    <div class="form-group">
        <label>작성일</label>
        <input type="text" value="${mv.date}" readonly>
    </div>
    <div class="form-group">
        <label>조회수</label>
        <input type="text" value="${mv.hitNum}" readonly>
    </div>
    
    <div class="btn-container">
        <button class="btn" onclick="enableEdit()">수정</button>
    </div>
    
</div>

</body>
</html>