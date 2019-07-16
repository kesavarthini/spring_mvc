<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h1>All the Employee Details of Publicis Sapient</h1>
	<br>
	<br>
	<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
		</tr>
		<c:forEach items="${emplist}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.age}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
</body>
</html>