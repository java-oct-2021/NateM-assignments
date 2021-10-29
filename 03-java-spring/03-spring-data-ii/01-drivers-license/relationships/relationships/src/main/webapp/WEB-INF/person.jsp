<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
<h1>New Person</h1>
	<form:form action="/person/new" method="post" modelAttribute="persons">
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:input path="lastName"/>
		</p>
		<button>Submit</button>
	</form:form>
	<br>
	<h2><a href="/license">New License</a></h2>
</body>
</html>