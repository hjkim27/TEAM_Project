<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>
<% pageContext.setAttribute("replaceChar", "\n");%>
<div class="body-info">
	<c:choose>
		<c:when test="${board.boardCode eq 'info' and board.notify eq 'no'}">
			<c:set var="boardName" value="정보게시판"/>
		</c:when>
		<c:when test="${board.boardCode eq 'who' and board.notify eq 'no'}">
			<c:set var="boardName" value="익명게시판"/>
		</c:when>
		<c:otherwise>
			<c:set var="boardName" value="공지사항"/>
		</c:otherwise>
	</c:choose>
	
	
	<div class="info-detail">
		<h1 class="info-title">${boardName }</h1>
	</div>
	<hr>
	<div class="info-inner">
		<div>
			
		</div>
		<table>
			<thead>
			<tr>
				<td align="left" style="padding-left: 2%;">
					${boardname } &nbsp;${board.title}
				</td>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td align="right">
						<fmt:formatDate var="regdate" value="${board.regdate}" pattern="yyyy-MM-dd"/>
						<fmt:formatDate var="moddate" value="${board.moddate}" pattern="yyyy-MM-dd"/>
						작성일 <c:out value="${regdate}"/> 
						<c:if test="${board.moddate != null}" >&nbsp;|&nbsp; 수정일 <c:out value="${moddate}"/></c:if><br>
						<c:if test="${board.boardCode eq 'info' and board.notify eq 'no'}">
							[ ${board.writer} ] &nbsp;|&nbsp; 
						</c:if> 
						<c:if test="${board.notify ne 'no'}">
							[관리자] &nbsp;|&nbsp; 
						</c:if> 
						조회수 <c:out value="${board.hit}"/>
						<c:if test="${boardName ne '공지사항'}">
							 &nbsp;|&nbsp; 추천수 <c:out value="${board.heart}"/>
						</c:if>
					</td>
				</tr>
				<tr>
					<td align="right">
						<c:if test="${loginInside eq board.writer }">
							<a onclick="location.href='<c:url value="/user/board/updateForm.do/${board.num}"/>'">[수정]</a>
							<a onclick="location.href='<c:url value="/user/board/delete.do/${board.num}"/>'">[삭제]</a>
						</c:if>
						<c:if test="${loginInside ne board.writer }">
							<a onclick="location.href='<c:url value="#"/>'">[신고]</a>
							<a onclick="location.href='<c:url value="/user/board/updateHeart.do/${board.num}"/>'">[추천]</a>
						</c:if>
						<c:if test="${sessionScope.loginInside ne board.writer}" >
							<button id="warnbtn" value="${board.num}">[신고]</button>
							<button id="heartbtn" value="${board.num}">[추천]</button>
						</c:if>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="left">${fn:replace(board.content, replaceChar, "<br/>")}</td>
				</tr>
				<tr>
					<c:if test="${fn:length(boardImages) == null}">
					<c:choose>
						<c:when test="${empty boardImages}">
							<c:set var="imagePath" value="/resources/img/noGoods.gif" />		
						</c:when>
					</c:choose>
						<td colspan="2"><img id="bnimg" src="<c:url value="${imagePath}" />"></td>
					</c:if>
					
					<c:if test="${fn:length(boardImages) > 0}">
						<c:forEach items="${boardImages}" var="imageOne" varStatus="status">
						<tr>
							<td colspan="2"><img class="byimg" src="<c:url value="/boardDis?saveName=${imageOne.saveName}" />"></td>
						</tr>
						</c:forEach>
					</c:if>
				</tr>
			</tbody>
		</table>
	</div>
	<div>
		<c:choose>
			<c:when test="${board.boardCode eq 'info' and board.notify eq 'no'}">
			<c:set var="boardList" value="/board/list.do?boardCode=info" />
			</c:when>
			<c:when test="${board.boardCode eq 'who' and board.notify eq 'no'}">
			<c:set var="boardList" value="/board/list.do?boardCode=who" />
			</c:when>
			<c:otherwise>
			<c:set var="boardList" value="/board/list.do?boardCode=notice" />
			</c:otherwise>
		</c:choose>
		<hr>
		<button onclick="location.href='<c:url value="${boardList}" />'">목록</button>
		
	</div>
<hr>
<div>

	</div>
</div>
<script type="text/javascript" src="<c:url value="/resources/js/boardscript.js" />"></script>
<script type="text/javascript">

	var warn = document.querySelector('#warnbtn');
	warn.addEventListener("click", warnClick);
	
	var heart = document.querySelector('#heartbtn');
	heart.addEventListener("click", heartClick);
	
	var bedit = document.querySelector('#boardedit');
	bedit.addEventListener("click", editCHK);
	
	var bdel = document.querySelector('#boarddel');
	bdel.addEventListener("click", delCHK);

var result = "<c:out value="${heartNo}"/>";
if(result == 'fail'){
	alert('추천하실 수 없습니다.');
}
	
/* const btn = (obj) => {
	   document.getElementById('insert').submit();
	}
	 */
</script>
<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>