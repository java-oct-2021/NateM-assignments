<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

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