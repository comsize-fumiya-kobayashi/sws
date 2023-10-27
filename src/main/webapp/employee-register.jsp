<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報登録画面</title>
</head>
<body>
	<h1>従業員情報登録画面</h1>
	<hr>
	<form action="EmployeeAddServlet" method="POST">
		<table border="1">
			<tr>
				<th>従業員コード</th>
				<td><input type="number" name="employee_code">
				</td>
			</tr>
			<tr>
				<th>氏</th>
				<td><input type="text" name="last_name"></td>
			</tr>
			<tr>
				<th>名</th>
				<td><input type="text" name="first_name"></td>
			</tr>
			<tr>
				<th>氏（かな）</th>
				<td><input type="text" name="last_kana_name"></td>
			</tr>
			<tr>
				<th>名（かな）</th>
				<td><input type="text" name="first_kana_name"></td>
			</tr>
			<tr>
				<th>性別</th>
				<td><input type="number" name="first_kana_name"></td>
			</tr>
			<tr>
				<th>生年月日</th>
				<td><input type="date" name="birth_day"></td>
			</tr>
			<tr>
				<th>所属部署情報</th>
				<td><input type="text" name="section_code"></td>
			</tr>
			<tr>
				<th>入社日</th>
				<td><input type="date" name="hire_code"></td>
			</tr>
		</table>
		<br>
		<div>
			<input type="submit" value="登録実行"> 
			<input type="reset"value="クリア">
		</div>
	</form>
	<br>
	<br>
	<form action="menu.jsp" method="POST">
		<div>
		<input type="submit" value="メニュー画面へ">
		</div>
	</form>

</body>
</html>