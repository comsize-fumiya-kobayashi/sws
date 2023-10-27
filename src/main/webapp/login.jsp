<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.dao.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<div style="text-align: center">
	<h1>ログイン</h1>
	<hr>
	<h2>ユーザIDとパスワードを入力してください</h2>
	
	<div>
	<form action="loginServlet" method="POST">
		<table style="margin-left:auto; margin-right:auto;">
			<tr>
				<th>ユーザID</th>
				<td><input type="text" name="user_id"></td>
			</tr>
			<tr>
				<th>パスワード</th>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
	<br>
	<div>
	<input type="submit" value="ログイン">
	<input type="reset" value="取消">
	</div>
	</form>
	
	 <%-- session.getAttribute(true);--%>
	 
    <%-- 認証失敗から呼び出されたのかどうか --%>
    <% Object status = session.getAttribute("status"); %>

    <%
    	if (status != null){
    %>
      IDまたはパスワードに不備があります
	<% 
      		session.setAttribute("status", null);
    	}
    %>
	
	
	<%
	UserDAO dao = (UserDAO)request.getAttribute("url");
	%>
			IDまたはパスワードに不備があります
	</div>
	</div>
</body>
</html>