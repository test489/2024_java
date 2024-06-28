<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.entity.UserBean,java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ一覧</title>
</head>
<body>

	<%@ include file="header.jsp" %>

	<%
		List<UserBean> userList = (List<UserBean>) request.getAttribute("userList");

		if (userList.size() != 0) {
	%>
	<h3>ユーザ一覧</h3>

	<table>
		<tr>
			<th>ユーザID</th>
			<th>氏名</th>
			<th>年齢</th>
		</tr>
	<%
			for (UserBean user : userList) {
	%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>
		</tr>
	<%
			}
	%>
		</table>
	<%
		} else {
	%>
	ユーザー情報がありません。<br>
	<%
		}
	%>
	
	<a href="menu-servlet">メニューに戻る</a>
	
	<%@ include file="footer.jsp" %>
</body>
</html>