<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<% Object loginChk = request.getAttribute("loginInside"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resources/css/style.css"
	rel="stylesheet">
</head>
<body>
<header class="inside-header">
	<div class="head-header">
		<ul class="head-header">
			<li class="head-header"><a class="head-header" href="<c:url value="#"/>">고객센터</a></li>
			<c:if test="${loginChk != null}">
				<li class="head-header"><a class="head-header" href="<c:url value="/member/logout.do"/>">로그아웃</a></li>				
			</c:if>
			<c:if test="${loginChk == null }">
				<li class="head-header"><a class="head-header" href="<c:url value="/inside/registForm.do"/>">회원가입</a></li>
				<li class="head-header">
					<a class="head-header" href="<c:url value="/member/loginForm.do"/>">로그인</a>
				</li>
			</c:if>
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
			<li class="head-list"><a class="head-list" href="<c:url value="#"/>">정보게시판</a></li>
			<li class="head-list"><a class="head-list" href="<c:url value="#"/>">익명게시판</a></li>
			<li class="head-list"><a class="head-list" href="<c:url value="#"/>">공지사항</a></li>
			<li class="head-list"><a class="head-list" href="<c:url value="#"/>">포인트몰</a></li>
			<li class="head-list"><a class="head-list" href="<c:url value="/inside/checkForm.do"/>">출석체크</a></li>			
			<li class="head-list"><a href="<c:url value="#"/>">
				<img class="icon" src="<%=request.getContextPath()%>/resources/img/btn_assatalk.png">
				</a></li>			
		</ul>
	</div>
</header>

	