<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.entity.EmployeeListBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報削除確認画面</title>
</head>
<body>
	<%
		EmployeeListBean employeeDelete = (EmployeeListBean) session.getAttribute("employeeDelete");
	%>


<h1>従業員情報削除確認画面</h1>
	<hr>
	<h2>従業員情報を削除します。本当によろしいですか？</h2>
	<br>
		<table border="1">
			<tr>
				<th>従業員コード</th>
				<td><%=employeeDelete.getEmployeeCode()%></td>
			</tr>
			<tr>
				<th>名</th>
				<td><%=employeeDelete.getLastName()%></td>
			</tr>
			<tr>
				<th>氏</th>
				<td><%=employeeDelete.getEmployeeCode()%></td>
			</tr>
			<tr>
				<th>氏かな</th>
				<td><%=employeeDelete.getFirstKanaName()%></td>
			</tr>
			<tr>
				<th>名かな</th>
				<td><%=employeeDelete.getLastKanaName()%></td>
			</tr>
			<tr>
				<th>性別</th>
				<td><%=employeeDelete.getGender()%></td>
			</tr>
			<tr>
				<th>生年月日</th>
				<td><%=employeeDelete.getBirthDay()%></td>
			</tr>
			<tr>
				<th>所属部署情報</th>
				<td><%=employeeDelete.getSectionCode()%></td>
			</tr>
			<tr>
				<th>入社日</th>
				<td><%=employeeDelete.getHireDate()%></td>
			</tr>
			
		</table>
		<br>
	<form action="employee-delete-servlet" method="POST">
		<input type="hidden" name="employee_code" value="<%=employeeDelete.getEmployeeCode()%>">
		<input type="submit" value="削除実行">
	</form>
	
</body>
</html>