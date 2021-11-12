<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit the Event</title>
</head>
<body>
			<h5>Edit Event - ${editEvent.eventName}</h5>
		<p>
			<a href="/events">Event Dashboard</a> <a href="/logout">Logout</a>
		</p>
		<form:form action="/events/edit/${editEvent.id}" method="post"
			modelAttribute="editedEvent">

			<div class="form-group">
				<form:label path="eventName">Event Name:</form:label>
				<form:errors class="text-danger" path="eventName" />
				<form:input class="form-control" path="eventName"
					value="${editEvent.eventName}" />
			</div>
			<div class="form-group">
				<form:label path="location">Location</form:label>
				<form:errors class="text-danger" path="location" />
				<form:input class="form-control" path="location"
					value="${editEvent.location}" />
			</div>
			<div class="form-group">
				<form:label path="date">Date</form:label>
				<form:errors class="text-danger" path="date" />
				<form:input class="form-control" path="date"
					value="${editEvent.date}" />

			</div>
			<input type="submit" class="btn btn-primary" value="Submit" />
		</form:form>

</body>
</html>