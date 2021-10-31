<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	
	<div class="container">
	<form:form action="/ninja/create" method="post" modelAttribute="ninjas">
	<p>
		<form:label path="dojo">Dojo:</form:label>
		<form:select path="dojo">
			<c:forEach items="${dojos}" var="dojos">
				<option value="${dojo.id}">${dojo.name}</option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName"/>
	</p>
	<p>
		<form:label path="age">Age</form:label>
		<form:input path="age"/>
	</p>
	<button>Create</button>
	</form:form>
			
	</div>

</body>
</html>