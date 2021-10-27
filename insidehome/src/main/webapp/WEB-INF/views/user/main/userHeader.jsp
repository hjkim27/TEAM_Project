<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resources/css/style.css"
	rel="stylesheet">
</head>
<body class="noDrag">
<section class="inside-header">
	<div>
		<a class="head-header" href="<c:url value="#"/>">고객센터</a>
		<a class="head-header" href="<c:url value="/inside/registForm.do"/>">회원가입</a>
		<a class="head-header" href="<c:url value="/member/loginForm.do"/>">로그인</a>
	</div>
	<div>
		<a class="head-list" href="<c:url value="#"/>">정보게시판</a>
		<a class="head-list" href="<c:url value="#"/>">익명게시판</a> 
		<a class="head-list" href="<c:url value="#"/>">공지사항</a> 
		<a class="head-list" href="<c:url value="#"/>">포인트몰</a> 
		<a class="head-list" href="<c:url value="/inside/checkin.do"/>">출석체크</a>
	</div>
</section>
<section class="content">
