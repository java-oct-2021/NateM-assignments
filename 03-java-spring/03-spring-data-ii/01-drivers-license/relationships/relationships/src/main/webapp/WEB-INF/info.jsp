<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information Page</title>
</head>
<body>
	<h1><c:out value="${person.firstName} ${person.lastName}"/></h1>
	<br>
	<h3>License Number: <c:out value="${license.number}"/></h3>
	<br>
	<h3>State: <c:out value="${license.state}"/></h3>
	<br>
	<h3>Expiration Date: <c:out value="${license.expiration_date}"/></h3>
	
	<a href="/person">Back to new person</a>

</body>
</html>