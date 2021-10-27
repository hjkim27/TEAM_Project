<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet">
</head>
<body>
<div>
	<h1>정보게시판</h1>
	<h2>SELECT</h2>
	<h3>SELECT</h3>
</div>
	<button class="move-btn" onclick="location.href='<c:url value="/main.do"/>'">메인페이지 이동</button>
	<button class="move-btn" onclick="location.href='<c:url value="/user/main.do"/>'">intercepterUser</button>	
	<a href="<c:url value="/manager/main.do"/>">intercepterManager</a>
	<a href="<c:url value="/inside/registForm.do"/>">회원가입</a>
			<a class="head-list" href="<c:url value="/manager/member/list.do"/>">회원정보</a>
	
	<form action="<c:url value="/inside/email.do"/>" method="post">
		<input type="submit" value="메일발송 테스트">
	</form>

</body>
</html>


	
