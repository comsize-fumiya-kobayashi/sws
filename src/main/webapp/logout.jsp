<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログアウト画面</title>
</head>
<body>
	<div style="text-align: center">
	<h1>ログアウト</h1>
	<hr>
	<h2>ログアウトしました。</h2>
	
	<%-- もしかしていらない…？ --%>
	<%
		session.invalidate();
	%>
	
	<div>
		<form action="login.jsp" method="POST">
			<input type="submit" value="ログイン画面へ">
		</form>
	</div>
	</div>
</body>
</html>