<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Events Dashboard</title>
</head>
<body>
<table class="table table-dark">
		<thead>
			<tr>
				<th>Event name</th>
				<th>Created By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${events}" var="event">
				<tr>
					<td><a href="/events/event/${event.id}"> <c:out
								value="${event.eventName}" />
					</a></td>
					<td><c:out value="${event.user.firstName}" /></td>
					
					<td>
				
            		</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="/events/new">Add New Event</a>
	<a href="/logout">Logout</a>

</body>
</html>