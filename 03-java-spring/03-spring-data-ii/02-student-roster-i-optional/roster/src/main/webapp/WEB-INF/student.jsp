<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
</head>
<body>
	<h1>New Student</h1>
	
	<form:form action="/student" method="post" modelAttribute="students">
		<p>
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="age">Age:</form:label>
			<form:input path="age"/>
		</p>
		<button>Submit</button>
		</form:form>
		<br>
		<a href="/show">View all students</a>
		<br>
		<a href="/contact">Contact Info</a>

</body>
</html>