<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/join" method="post"></form>
	<h2>ȸ������</h2>
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
			<th>����Ÿ��</th>
			<td>
			<select name="authority">
				<option value="ROLE_USER">ȸ��</option>
				<option value="ROLE_ADMIN">������</option>
			</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="����">
</body>
</html>