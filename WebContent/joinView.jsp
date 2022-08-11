<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link rel="stylesheet" href="css/join.css" />
<script src="js/idCheckedOk.js" defer></script>
</head>
<body>
	<div class="container">
		<div class="inner-con">
			<%@include file="header.jsp" %>
			<form action="joinOk.ax" method="post" id="joinForm" >
				<table>
					<thead>
						<tr>
							<th>SIGN UP</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								<label for="userId">아이디</label> <br />
								<input type="text" name="userId" id="userId" placeholder="아이디를 입력해 주세요." />
								<input type="button" value="중복확인" id="idCheckBtn" class=""/>
							</td>
						</tr>
						<tr>
							<td>
								<label for="userPw">비밀번호</label> <br />
								<input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력해 주세요." />
							</td>
						</tr>
						<tr>
							<td>
								<label for="userPhone">휴대전화</label> <br />
								<input type="text" name="userPhone" id="userPhone" placeholder="전화번호를 입력해 주세요. (ex. 010-0000-0000)" />
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td>
								<a href="index.ax">HOME</a>
								<input type="reset" value="취소" />
								<input type="button" value="가입하기" id="joinOkBtn" />
							</td>
						</tr>
					</tfoot>
				</table>
			</form>
			<div class="content">
				
			</div>
		</div>
	</div>
</body>
</html>