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

	<table>

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
			<td><%=employee.getUpdateDatetime()%></td>
		</tr>
		<%
		}
		%>

	</table>
	<% }else{
	
	%>従業員情報がありません。
	<br>
	<%
	}
	%>
	
	<form action="EmployeeEdit.jsp" method="POST">
	<input type="submit" value = "従業員情報編集画面へ">
	</form>
	
	<form action="EmployeeDelete.jsp" method="POST">
	<input type="submit" value = "従業員情報削除確認画面へ">
	</form>
	

</body>
</html>