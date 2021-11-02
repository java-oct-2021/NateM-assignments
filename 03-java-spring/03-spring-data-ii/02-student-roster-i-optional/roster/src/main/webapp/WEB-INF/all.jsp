<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students</title>
</head>
<body>
	<h1>All Students</h1>
	
	<table class="table table-dark">
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${allStudents}" var="student">
		 	<tr>
		 	 	<td><c:out value="${student.firstName} ${students.lastName}"/></td>
		 	 	<td><c:out value="${student.age}"/></td>
		 	 	<td><c:out value="${student.contact.address}"/></td>
		 	 	<td><c:out value="${student.contact.city}"/></td>
		 	 	<td><c:out value="${student.contact.state}"/></td>
		 	 </tr>
		 	</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="/">Home</a>
</body>
</html>