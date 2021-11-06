<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@include file="/WEB-INF/views/manager/main/mgrHeader.jsp"%>


<div class="body-info">
   <div class="info-detail">
      <h1 class="info-title">관리자 글수정</h1>
   </div>
   <hr>
   <div class="info-inner">
    <form method="POST" action="<c:url value="/manager/board/update.do"/>">
     		<table border="1">
				<tr>
					<th>게시판 유형</th>
					<td>
						<c:set var="bCode" value="${reboard.boardCode}"/>
						<c:if test="${bCode eq 'info'}">
							<label><input name="boardCode" type="radio" value="info" name="notify" checked="checked">정보게시판</label>
							<label><input name="boardCode" type="radio" value="who" name="notify"> 익명게시판</label>
						</c:if>
						<c:if test="${bCode eq 'who'}">
							<label><input name="boardCode" type="radio" value="info" name="notify">정보게시판</label>
							<label><input name="boardCode" type="radio" value="who" name="notify" checked="checked"> 익명게시판</label>
						</c:if>
					</td>
				</tr>
				<tr>
					<th>글 제목</th>
					<td><input style="width: 90%" type="text" value="${reboard.title}" name="title" required="required"></td>
				</tr>
				<tr>
					<th>글 내용</th>
					<td><textarea class="guideContent" name="content" required="required">${reboard.content}</textarea></td>
				</tr>
				<tr>
					<th>상단표시여부</th>
					<td>
						<c:set var="noti" value="${reboard.notify}"/>
						<c:if test="${noti eq 'yes'}">
							<label><input type="radio" value="yes" name="notify"  checked="checked" > 상단공지 취소</label>
							<label><input type="radio" value="notice" name="notify"> 상단공지</label>
						</c:if>
						<c:if test="${noti eq 'notice'}">
							<label><input type="radio" value="yes" name="notify" > 상단공지 취소</label>
							<label><input type="radio" value="notice" name="notify" checked="checked" > 상단공지</label>
						</c:if>
					</td>
				</tr>
			</table>
			<input type="hidden" value="${reboard.num}" name="num">
			<input type="submit" value="등록">
    </form>
   </div>
</div>

<%@include file="/WEB-INF/views/manager/main/mgrFooter.jsp"%>