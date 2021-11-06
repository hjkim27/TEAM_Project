<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/manager/main/mgrHeader.jsp"%>


<div class="body-info">
   <div class="info-detail">
      <h1 class="info-title">관리자 글상세</h1>
   </div>
   <hr>
   <div class="info-inner">
   <table border="1">
		<tr>
			<th>게시판 유형</th>
			<td>
				<c:if test="${board.notify ne 'no'}"> [공지] </c:if>
				${board.boardCode}
				<c:if test="${bCode eq 'info'}"> 정보게시판 </c:if>
				<c:if test="${bCode eq 'who'}"> 익명게시판 </c:if>
			</td>
		</tr>
		<tr>
			<th>글 제목</th>
			<td>${board.title}</td>
		</tr>
		<tr>
			<th>글 작성자</th>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<th>글 내용</th>
			<td>${board.content}</td>
		</tr>
	</table>
		<form style="padding: 0; float: left;" action="<c:url value="/manager/board/delete.do/${board.num}"/>" method="post">
	    <input type="submit" value="삭제">
		</form>
	<c:if test="${board.notify ne 'no'}">  
	    <input type="button" value="수정" onclick="location.href='<c:url value="/manager/board/updateForm.do/${board.num}"/>'">
	</c:if>
      
   </div>
</div>

<%@include file="/WEB-INF/views/manager/main/mgrFooter.jsp"%>