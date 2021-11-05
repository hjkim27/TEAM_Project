<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>


출석페이지입니다.

<div class="calender">
	tr
</div>

<div>
	<a href="<c:url value="/inside/check.do"/>"> <img
		src="<c:url value="/resources/img/check-on.png"/>">
	</a>
</div>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>