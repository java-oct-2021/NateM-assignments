<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

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