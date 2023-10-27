<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, model.entity.EmployeeListBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報一覧表示画面</title>
</head>
<body>

	<%
	List<EmployeeListBean> employeeList = (List<EmployeeListBean>) request.getAttribute("employeeList");

	%>
	<h3>従業員情報一覧</h3>

	<table border="1">
		<tr>
			<th>従業員コード</th>
			<th>氏</th>
			<th>名</th>
			<th>氏かな</th>
			<th>名かな</th>
			<th>性別</th>
			<th>生年月日</th>
			<th>部署コード</th>
			<th>入社日</th>
		</tr>

		<%
		for (EmployeeListBean employee : employeeList) {
		%>
		<tr>

			<td><%=employee.getEmployeeCode()%></td>
			<td><%=employee.getLastName()%></td>
			<td><%=employee.getFirstName()%></td>
			<td><%=employee.getLastKanaName()%></td>
			<td><%=employee.getFirstKanaName()%></td>
			<td><%=employee.getGender()%></td>
			<td><%=employee.getBirthDay()%></td>
			<td><%=employee.getSectionCode()%></td>
			<td><%=employee.getHireDate()%></td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>