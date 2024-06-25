<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>メニュー</h1><br>
<form action="UserList-Servlet" method="POST">
<input type= submit value= "ユーザ一覧表示">
</form>
<form action="UserList-insert-Servlet" method="POST">
<input type= submit value= "ユーザ追加">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>