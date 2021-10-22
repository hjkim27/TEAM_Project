<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet">
</head>
<body class="noDrag">
<div>
	<h1>관리자 페이지</h1>
</div>
<div>
	<img src="<%=request.getContextPath() %>/resources/img/404err.png" height="75%"/>
</div>
<div>
	<button onclick="location.href='<c:url value="/main.do"/>'">메인페이지 이동</button>
	<button onclick="location.href='<c:url value="/user/main.do"/>'">intercepterUser</button>	
	<a href="<c:url value="/manager/main.do"/>">intercepterManager</a>
</div>
</body>
</html>