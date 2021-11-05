<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>


<div class="body-info">
	<div class="info-detail">
		<c:if test="${psCmd.boardCode eq 'info' }">
			<ul>
				<li>이번주 인기글</li>
				<c:forEach items="${heartList }" var="heart"> 
					<li>${heart.title}</li>
				</c:forEach>
			</ul>
			<ul>
				<li>BEST</li>
				<c:forEach items="${hitList }" var="heart"> 
					<li>${hit.title}</li>
				</c:forEach>
			</ul>
		</c:if>
	</div>
	
	
	
	
	<div class="info-detail">
		<table>
			<caption>
				검색관련 입력 부분
			</caption>
			<thead>
				<tr>
					<td>글번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>등록일자</td>
					<td>수정일자</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${ notify ne 'notice' }">
					<c:forEach items="${notifyList}" var="noti">
						<tr>
							<td>[공지]</td>
							<td>${noti.TITLE}</td>
							<td>관리자</td>
							<td><fmt:formatDate value="${noti.REGDATE}" pattern="yyyy-MM-dd" /></td>
							<td><fmt:formatDate value="${noti.MODDATE}" pattern="yyyy-MM-dd" /></td>
						</tr>
						<tr>
							<td></td>
							<td colspan="3">조회수 ${noti.HIT}</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:set var="boardNbr" value="${psCmd.count }"/>
				<c:forEach items="${boardList}" var="article">
					<tr>
						<td>${boardNbr}</td>
						<td>${article.TITLE} 
							<c:if test="${article.CNT ne null}">
								(${article.CNT })
							</c:if>
						</td>
						<td>${article.WRITER}</td>
						<td><fmt:formatDate value="${article.REGDATE}" pattern="yyyy-MM-dd" /></td>
						<td><fmt:formatDate value="${article.MODDATE}" pattern="yyyy-MM-dd" /></td>
					</tr>
					<tr>
						<td></td>
						<td colspan="3">조회수 ${article.HIT} | 추천수  ${article.HEART}</td>
					</tr>
					<c:set var="boardNbr" value="${boardNbr-1 }"></c:set>
				</c:forEach>
			</tbody>
		</table>		
	</div>
</div>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>