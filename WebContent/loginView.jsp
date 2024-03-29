<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	if(session.getAttribute("sessionId") != null) {
		out.print("<script>");
		out.print("alert('로그아웃 후 접근 가능한 페이지입니다.')");
		out.print("location.href='/ajaxProject_0811/index.ax'");
		out.print("</script>");
	}
%>   --%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/login.css" />
<script src="js/ajaxLoginOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="login">
	<%=
		session.getAttribute("sessionId")
	%>
		<form action="loginOk.ax" method="post" id="loginForm">
			<table>
				<thead>
					<tr>
						<th colspan="2">LOGIN</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<label for="userId">아이디</label>
						</td>
						<td>
							<input type="text" name="userId" id="userId" />
						</td>
					</tr>
					<tr>
						<td>
							<label for="userPw">비밀번호</label>
						</td>
						<td>
							<input type="text" name="userPw" id="userPw" />
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td>
							<a href="joinView.ax">회원가입</a>
							<input type="button" value="로그인" id="loginOkBtn" />
						</td>
					</tr>					
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>