<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧表示</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>ユーザ一覧</h1>
	<br>

	<%
	List<UserBean> userList = (List<UserBean>) request.getAttribute("userList");
	if (userList.size() != 0) {
	%>
	<table>
		<tr>
			<th>ユーザID</th>
			<th>氏名</th>
			<th>年齢</th>

		</tr>

		<%
		for (userBean user : userList) {
		%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>

			<%
			}
			%>
		
	</table>
	<%
	} else {
	%>
	<%
	}
	%>

	<a href="menu.jsp">メニューに戻る</a>

	<%@ include file="footer.jsp"%>
</body>
</html>