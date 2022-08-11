<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/login.css" />
<script src="js/loginOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="login">
		<form action="loginOk.ax" method="post" id="loginForm">
			<label for="userId">아이디</label>
			<input type="text" name="userId" id="userId" />
			<label for="userPw">비밀번호</label>
			<input type="text" name="userPw" id="userPw" />
			<br />
			<a href="joinView.ax">회원가입</a>
			<input type="button" value="로그인" id="loginOkBtn" />
		</form>
	</div>
</body>
</html>