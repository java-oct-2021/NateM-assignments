<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

<title>New Event</title>
</head>
<body>
	<div class="container">
	<h1>Create a New Event</h1>
	<p>
		<a href="/events">Event Dashboard</a>
		<a href="/logout">Logout</a>	
	</p>	
	<form:form action="/events/create" method="post" modelAttribute="newEvent">
	    <div class="form-group">
	        <form:label path="eventName">event Name:</form:label>
	        <form:errors class="text-danger" path="eventName"/>
	        <form:input class="form-control" path="eventName"/>
	    </div>
	    <div class="form-group">
	        <form:label path="location">Event location:</form:label>
	        <form:errors class="text-danger" path="location"/>
	        <form:textarea class="form-control" path="location"/>
	    </div>
	    <div class="form-group">
	        <form:label path="date">Event date:</form:label>
	        <form:errors class="text-danger" path="date"/>
	        <form:textarea class="form-control" path="date"/>
	    </div>
	      <!-- Hidden Input for userId -->
	      <form:input type="hidden" value="${userId}" path="user"/>
	   
	    <input type="submit" class="btn btn-primary" value="Submit"/>
	</form:form>    
</div>
</body>
</html>