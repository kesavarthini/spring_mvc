<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">

	<h1>Details of ${employee.name} </h1>
	<br>
	<br>
	<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
		</tr>
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.age}</td>
				<td>${employee.salary}</td>
			</tr>
	</table>
	<br>
	<br>
</body>
</html>