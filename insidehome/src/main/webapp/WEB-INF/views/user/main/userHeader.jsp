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
<header class="inside-header">
	<div class="head-area">
		<ul class="service-head">
			<li><a class="head-header" href="<c:url value="#"/>">고객센터</a></li>
			<li><a class="head-header" href="<c:url value="/inside/registForm.do"/>">회원가입</a></li>				
			<li><a class="head-header" href="<c:url value="/member/loginForm.do"/>">로그인</a></li>				
		</ul>
	</div>
	<div class="logo-area">
		<h2>
			<a href="<c:url value="/inside/main.do"/>">
				<img class="logo" src="<%=request.getContextPath()%>/resources/img/inside-logo.png">
			</a>
		</h2>
	</div>
	<div class="service-area">
		<ul class="service-list">
			<li><a class="head-list" href="<c:url value="#"/>">정보게시판</a></li>
			<li><a class="head-list" href="<c:url value="#"/>">익명게시판</a></li>
			<li><a class="head-list" href="<c:url value="#"/>">공지사항</a></li>
			<li><a class="head-list" href="<c:url value="#"/>">포인트몰</a></li>
			<li><a class="head-list" href="<c:url value="/inside/checkForm.do"/>">출석체크</a></li>			
		</ul>
	</div>
</header>
<section class="content">
