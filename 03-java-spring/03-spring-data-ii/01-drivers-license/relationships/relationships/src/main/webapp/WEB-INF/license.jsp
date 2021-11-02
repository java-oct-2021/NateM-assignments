<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>

	<h1>New License</h1>
		<form:form action="/license/new" method="post" modelAttribute="license">
		<p>
			<form:label path="person">Person</form:label>
			<form:select path="person">
				<c:forEach items="${persons}" var="person">
					<option value="${person.id}">${person.firstName} ${person.lastName}</option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="state">State</form:label>
			<form:input path="state"/>
		</p>
		<p>
			<form:label path="expiration_date">Expiration Date</form:label>
			<form:input type="date" path="expiration_date"/>
		</p>
		<button>Submit</button>
		</form:form>
</body>
</html>