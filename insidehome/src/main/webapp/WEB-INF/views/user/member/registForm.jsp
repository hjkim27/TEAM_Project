<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>
<div class="bodyinfo">
	<div class="info-detail">

		<h1 class="info-title">회원가입</h1>
		<form:form action="regist.do" commandName="regCmd">
			<p>
				<label> 이메일 <form:input path="email" /> <form:errors
						path="email" />
				</label> 
			</p>
			<p>
				<label> 닉네임 <form:input path="nickname" /> <form:errors
						path="nickname" />
				</label> 
			</p>
			<p>
				<label> 비밀번호 <form:password path="password" /> <form:errors
						path="password" />
				</label> 
			</p>
			<p>
				<label> 비밀번호 확인<form:password path="passwordCheck" /> <form:errors
						path="passwordCheck" />
				</label> 
			</p>
			<p>
				<label> 이름 <form:input path="name" /> <form:errors
						path="name" />
				</label> 
			</p>
			<p>
				<label> 번호1 <form:input path="phone1" /> <form:errors
						path="phone1" />
				</label> 
			</p>
			<p>
				<label> 번호2 <form:input path="phone2" /> <form:errors
						path="phone2" />
				</label>
			</p>
			<input type="submit" value="회원가입">
		</form:form>
	</div>
</div>
<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>