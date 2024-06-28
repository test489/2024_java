<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.entity.UserBean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3>メニュー</h3>
	<form action="user-list-servlet" method="POST">
		<input type="submit" value="ユーザ一覧表示">
	</form>
	<%@ include file="footer.jsp" %>
</body>
</html>