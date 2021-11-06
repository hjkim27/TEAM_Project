<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>

<div class="body-info">
	<div class="info-detail">
		<c:if test="${psCmd.boardCode eq 'info' }">
			<ul>
				<li>이번주 인기글</li>
				<c:if test="${fn:length(heartList)==0}">
					<li>이번주 인기글이 존재하지 않습니다.</li>
				</c:if>
				<c:forEach items="${heartList }" var="heart"> 
 					<li>${heart.title}</li>
				</c:forEach>
			</ul>
			<ul>
				<li>BEST</li>
				<c:if test="${fn:length(hitList)==0}">
					<li>이번주 BEST글이 존재하지 않습니다.</li>
				</c:if>
				<c:forEach items="${hitList }" var="hit"> 
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
					<td>조회수 </td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${ notify ne 'notice' }">
					<c:forEach items="${notifyList}" var="noti">
						<tr>
							<td align="center">[공지]</td>
							<td>${noti.TITLE}</td>
							<td align="center">관리자</td>
							<td align="center"><fmt:formatDate value="${noti.REGDATE}" pattern="yyyy-MM-dd" /></td>
							<td align="center">${noti.HIT}</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:set var="boardNbr" value="${psCmd.count }"/>
				<c:forEach items="${boardList}" var="article">
					<tr>
						<td align="center">${boardNbr}</td>
						<td>${article.TITLE} 
							[좋아요 ${article.HEART}] 
							<c:if test="${article.CNT ne null}">
								(${article.CNT })
							</c:if>
						</td>
						<td align="center">${article.WRITER}</td>
						<td align="center"><fmt:formatDate value="${article.REGDATE}" pattern="yyyy-MM-dd" /></td>
						<td align="center">${article.HIT} </td>
					</tr>
					<c:set var="boardNbr" value="${boardNbr-1 }"></c:set>
				</c:forEach>
			</tbody>
		</table>		
	</div>
		<c:if test="${psCmd.count > 0 }">
			<c:set var="pageCount" value="${psCmd.number}"/>
			<fmt:parseNumber var="pageCount" value="${pageCount }" integerOnly="true"/>
			
			<c:set var="pageBlock" value="${5 }"/>
			
			<fmt:parseNumber var="result" value="${(psCmd.currentPage-1)/pageBlock }" integerOnly="true"/>
			<c:set var="startPage" value="${result*pageBlock + 1 }"></c:set>
			<c:set var="endPage" value="${startPage + pageBlock -1 }"></c:set>
			
			<c:if test="${endPage>pageCount }">
				<c:set var="endPage" value="${pageCount }"/>
			</c:if>
			<c:choose>
				<c:when test="${psCmd.word}">
					<c:set var="options" value="type=${psCmd.type}&word=${psCmd.word}&"></c:set>
				</c:when>
				<c:otherwise>
					<c:set var="options" value=""></c:set>
				</c:otherwise>
			</c:choose>
			
			<c:if test="${startPage>pageBlock }">
				<input type="button" onclick="location.href='list.do?${option}pageNum=${startPage-pageBlock}'" value="◀">
			</c:if>
			<c:forEach var="i" begin="${startPage}" end="${endPage}" >
				<a href="list.do?psCmd=${psCmd}&pageNum=${i }">[${i }]</a>
			</c:forEach>
			<c:if test="${endPage<pageCount }">
				<input type="button" onclick="location.href='list.do?${option}&pageNum=${startPage+pageBlock}'" value="▶">
			</c:if>
		
		
		
			<c:choose>
				<c:when test="${op!=null}">
					<c:set var="options" value="type=${op.type}&str=${op.str}&"></c:set>
				</c:when>
				<c:otherwise>
					<c:set var="options" value=""></c:set>
				</c:otherwise>
			</c:choose>
			
			<c:if test="${startPage>pageBlock }">
				<a href="list.board?${options}pageNum=${startPage-pageBlock }">[이전]</a>
			</c:if>
			<c:forEach var="i" begin="${startPage }" end="${endPage }" >
				<a href="list.board?${options}pageNum=${i }">[${i }]</a>
			</c:forEach>
			<c:if test="${endPage<pageCount }">
				<a href="list.board?${options}pageNum=${startPage+pageBlock }">[다음]</a>
			</c:if>
		
		
		</c:if>
</div>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>