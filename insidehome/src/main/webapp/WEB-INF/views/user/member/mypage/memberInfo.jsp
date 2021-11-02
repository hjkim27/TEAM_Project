<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/views/user/main/userHeader.jsp"%>


<div class="bodyinfo">
	<div class="info-detail">
		<a class="info-title" href="<c:url value="/user/mypage/info/view.do" />">내 정보 관리
			<img class="explain" title="개인정보 확인" src="<c:url value="/resources/img/icon-infoEdit.png"/>">
		</a>
		<a href="<c:url value="/user/mypage/main.do"/>">마이페이지 기본으로 이동</a>
	</div>
		<hr>
	<br><br><br>
	<div style="padding-left: 10%; width: 80%;">
			<div class="info-detail">
				
			</div>
			<div class="info-detail">
				
			</div>
		
	</div>
</div>

<%@include file="/WEB-INF/views/user/main/userFooter.jsp"%>
