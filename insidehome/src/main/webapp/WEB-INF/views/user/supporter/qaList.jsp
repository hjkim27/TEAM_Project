<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>

<div id="top-btn"></div>
<div class="body-info">
	<div class="info-detail">
		<h1 class="info-title">QA관리</h1>
	</div>
	<hr>
	<div class="info-inner">
		<table>
			<caption>
				<c:if test="${loginInside !=null }">
					<input style="width: 10%;" type="button" onclick="location.href='<c:url value="/user/ask/insertForm.do"/>'" value="문의하기">
					<input style="width: 10%;" type="button" onclick="location.href='<c:url value="/user/ask/list.do"/>'" value="내문의 조회">
				</c:if>
				<input type="button" onclick="location.href='<c:url value="/inside/question.do"/>'" value="QA목록조회">
			</caption>
			<thead>
				<tr>
					<td class="table-inner"><b>번호</b></td>
					<td class="table-inner"><b>제목</b></td>
					<td class="table-inner"><b>내용</b></td>
				</tr>
			</thead>
			<tbody>
				<c:set var="number" value="1"/>
				<c:forEach items="${qa}" var="info">
					<tr>
						<td style="border-bottom: 1px #EAEAEA solid;">${number}</td>
						<td align="left" style="padding-left: 10px;border-bottom: 1px #EAEAEA solid;">${info.TITLE}</td>
						<td align="left" style="padding-left: 10px;border-bottom: 1px #EAEAEA solid;">${info.CONTENT}</td>
					</tr>
					<c:set var="number" value="${number+1 }"/>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div style="position: fixed; bottom: 15%; right: 5%;">
		<a href="#top-btn">
			<img src="https://img.icons8.com/ultraviolet/50/000000/circled-chevron-up.png"/>
		</a>
	</div>
</div>



<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>