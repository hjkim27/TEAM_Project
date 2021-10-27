<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/WEB-INF/views/manager/main/mgrHeader.jsp"%>


<div>
	<div>회원정보</div>
	<div>
		<div>
			<form:form action="/manager/member/list.do">
				<input type="text" placeholder="회원 닉네임 검색">
				<input type="hidden" value="${type}" name="type">
				<input type="submit" value="검색">
			</form:form>
			<form:form action="/manager/member/list.do">
				<input type="hidden" value="normal" name="type">
				<input type="submit" value="일반회원">
			</form:form>
			<form:form action="/manager/member/list.do">
				<input type="hidden" value="black" name="type">
				<input type="submit" value="제적/탈퇴">
			</form:form>
		</div>
	</div>
	<div>
		<ol class="listhead">
			<li class="listhead-date"><div class="list-date">이메일</div></li>
			<li class="listhead-date"><div class="list-date">닉네임</div></li>
			<li class="listhead-date"><div class="list-date">가입일자</div></li>
			<li class="listhead-date"><div class="list-date">최근접속시간</div></li>
		</ol>
	</div>
	<br>
	<div>
		<c:forEach items="${memberList}" var="info">
			<ol class="listbody">
				<li class="listbody-date"><div class="list-date">${info.EMAIL}</div></li>
				<li class="listbody-date"><div class="list-date">${info.NICKNAME}</div></li>
				<li class="listbody-date"><div class="list-date">${info.REGDATE}</div></li>
				<li class="listbody-date"><div class="list-date">${info.LOGINTIME}</div></li>
			</ol>
			<br>
		</c:forEach>
	</div>
</div>



<%@include file="/WEB-INF/views/manager/main/mgrFooter.jsp"%>