<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/join" method="post">
		<h2>회원가입</h2>
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<th>PWD</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<th>권한타입</th>
				<td><select name="authority">
						<option value="ROLE_USER">회원</option>
						<option value="ROLE_ADMIN">관리자</option>
				</select></td>
			</tr>
		</table>
		<input type="submit" value="가입">
		<a href="/login">로그인</a>
	</form>
</body>
</html>