<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/user/member/common/commHeader.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="bodyinfo">
	<div class="info-detail">
			<form:form action="login.do" commandName="loginCmd" class="login-info">
			<ul class="login-info-first">
				<li><img src="<c:url value="/resources/img/inside-logo.png"/>" width="80%"></li>
				<li style="margin-right: 5%;">
					<label class="login-option"><input type="radio" name="loginOption" checked="checked"/>옵션 사용 안함</label>&nbsp;&nbsp; 
					<label class="login-option"><input type="radio" name="loginOption" value="rememberEmail"/>이메일 유지</label> &nbsp;&nbsp;
					<label class="login-option"><input type="radio" name="loginOption" value="autoLogin"/>자동로그인</label> &nbsp;	&nbsp;
				</li>
			</ul>
			<ul class="login-info-second">
				<li><form:input path="email" class="login-info-label" placeholder="@를 포함한 이메일 전체 입력"/></li>
				<li><form:password path="password" class="login-info-label" placeholder="비밀번호 입력"/></li>
				<li></li>
				<li></li>
			</ul>
		</form:form>
	</div>
</div>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>