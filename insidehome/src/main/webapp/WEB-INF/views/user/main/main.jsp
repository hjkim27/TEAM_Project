<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<%@include file="/WEB-INF/views/user/main/userHeader.jsp" %>

<div>
	<h1>사용자 페이지</h1>
</div>
	<button onclick="location.href='<c:url value="/main.do"/>'">메인페이지 이동</button>
	<button onclick="location.href='<c:url value="/user/main.do"/>'">intercepterUser</button>	
	<a href="<c:url value="/manager/main.do"/>">intercepterManager</a>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp" %>