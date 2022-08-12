<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteView</title>
<link rel="stylesheet" href="css/login.css" />
<script src="js/ajaxDeleteOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="delete">
		<form action="deleteOk.ax" method="post" id="deleteForm">
			<table>
				<thead>
					<tr>
						<th colspan="2">회원탈퇴</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<label for="userId">아이디</label>
						</td>
						<td>
							<input type="text" name="userId" id="userId"/>
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
							<input type="button" value="회원탈퇴" id="deleteOkBtn" />
						</td>
					</tr>					
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>