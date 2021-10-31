<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	
	<div class="container">
		<form:form action="/dojo/create" method="post" modelAttribute="dojos">
		<p>
			<form:label path="name">Name:</form:label>
			<form:input path="name"/>
		</p>
		<button>Create</button>
		</form:form>
	</div>
			
	
		
	
	
</body>
</html>