<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.List,model.entity.EmployeeListBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報一覧表示画面</title>
</head>
<body>


	<%
	List<EmployeeListBean> employeeList = (List<EmployeeListBean>) request.getAttribute("employeeList");

	if (employeeList.size() != 0) {
	%>
	<h3>従業員情報一覧</h3>

	<table border=1>
		<tr>
			<th>従業員コード</th>
			<th>氏名</th>
			<th>氏名かな</th>
			<th>性別</th>
			<th>生年月日</th>
			<th>所属部署名</th>
			<th>入社日</th>

		</tr>

		<%
		for (EmployeeListBean employee : employeeList) {
		%>
		<tr>

			<td><%=employee.getEmployeeCode()%></td>
			<td><%=employee.getLastName()%> <%=employee.getFirstName()%></td>
			<td><%=employee.getLastKanaName()%> <%=employee.getFirstKanaName()%></td>
			<td><%=employee.getGender()%></td>
			<td><%=employee.getBirthDay()%></td>
			<td><%=employee.getSectionCode()%></td>
			<td><%=employee.getHireDate()%></td>

		</tr>
		<%
		}
		%>

	</table>
	<%
	} else {
	%>従業員情報がありません。
	<br>
	<%
	}
	%>

	<form action="employee-register.jsp" method="POST">
		<input type="submit" value="従業員情報登録画面へ">
	</form>

	<form action="EmployeeDelete.jsp" method="POST">
		<input type="submit" value="従業員情報削除確認画面へ">
	</form>


</body>
</html>