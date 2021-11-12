<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Event</title>
</head>
<body>
	<h5>
		Event Name:
		<c:out value="${event.eventName}" />
	</h5>
	<p>
		Creator:
		<c:out value="${event.user.firstName}" />
	</p>
	<p>
		Location:
		<c:out value="${event.location}" />
	</p>
	<p>
		Date:
		<c:out value="${event.date}"/>
	</p>
	<!-- Check if album belongs to user -->
	<c:if test="${event.user.id==userLoggedIn}">
		<a href="/events/delete/${event.id}"> Delete </a>
		<a href="/events/edit/${event.id}">Edit</a>
	</c:if>
	
</body>
</html>