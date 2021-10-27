<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>

<h2>회원입력 정보</h2>
<form:form action="regist.do" commandName="regCmd">
<p>
	<label>
		이메일 <form:input path="email"/> <form:errors path="email"/>
	</label>
	<label>
		닉네임 <form:input path="nickname"/> <form:errors path="nickname"/>
	</label>
	<label>
		비밀번호 <form:password path="password"/> <form:errors path="password"/>
	</label>
	<label>
		비밀번호 확인<form:password path="passwordCheck"/> <form:errors path="passwordCheck"/>
	</label>
	<label>
		이름 <form:input path="name"/> <form:errors path="name"/>
	</label>
	<label>
		번호1 <form:input path="phone1"/> <form:errors path="phone1"/>
	</label>
	<label>
		번호2 <form:input path="phone2"/> <form:errors path="phone2"/>
	</label>
</p>
<input type="submit" value="회원가입">
</form:form>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>