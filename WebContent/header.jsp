<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="header">
	<div class="nav">
		<div class="top-nav">
			<a href="index.ax">AJAX 실습</a>
		</div>
		<div class="bottom-nav">
			<div class="gnb">
				<ul>
					<%
						String sessionId=(String)session.getAttribute("sessionId");
						if(sessionId==null) {
					%>
					<li><a href="index.ax">HOME</a></li>
					<li><a href="boardListView.ax">게시글 목록</a></li>
					<li><a href="joinView.ax">회원가입</a></li>
					<li><a href="loginView.ax">로그인</a></li>
					<%		
						} else if(sessionId.equals("ADMIN")) {
					%>
					<script src="js/ajaxLogout.js" defer></script>
					<li><a href="index.ax">HOME</a></li>
					<li><a href="deleteView.ax">회원탈퇴</a></li>
					<li><a href="admin.ax">관리자 페이지</a></li>
					<li><a href="#" id="logoutBtn">로그아웃</a></li>
					<li><a href="#"><%=sessionId %>님, 환영합니다</a></li>
					<%		
						} else if(sessionId!=null) {
					%>
					<script src="js/ajaxLogout.js" defer></script> 
					<li><a href="index.ax">HOME</a></li>
					<li><a href="deleteView.ax">회원탈퇴</a></li>
					<li><a href="memberView.ax?userId=<%=sessionId %>">마이 페이지</a></li>
					<li><a href="#" id="logoutBtn">로그아웃</a></li>
					<li><a href="#"><%=sessionId %>님, 환영합니다</a></li>
					<%		
						}
					%>
				</ul>
			</div>
		</div>
	</div>
</div>