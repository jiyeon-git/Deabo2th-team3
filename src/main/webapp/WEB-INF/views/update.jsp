<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<form action="/update" method="post">
<h2>비밀번호 변경</h2>

	<table>
 		<tr>
			<th>ID</th>
			<td><input type="text" name="userid"></td>
		</tr>
		<tr>
			<th>현재 비밀번호</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>변경할 비밀번호</th>
			<td><input type="password" name="newPassword"></td>
		</tr>
	</table>
	<input type="submit" value="변경">
</form>
</body>
</html>