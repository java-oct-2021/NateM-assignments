<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo and Ninjas</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${showDojo.name}"/></h1>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<tbody>
				<c:forEach items="${allNinjas}" var="ninjas">
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<a href="/dojo">Home</a>

</body>
</html>