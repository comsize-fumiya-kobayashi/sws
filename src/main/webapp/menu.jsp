<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
</head>
<body>
	<div style="text-align: center">
	<h1>メニュー</h1>
	<hr>
	
	<div>
		<form action="employee-list-servlet" method="POST">
			<input type="submit" value="商品一覧">
		</form>
		<br>
		<form action="logout.jsp" method="POST">
			<input type="submit" value="ログアウト">
		</form>
	</div>
	</div>
</body>
</html>