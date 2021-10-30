<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Contact</title>
</head>
<body>
<h1>Contact Info</h1>

	<form:form action="/contact/create" method="post" modelAttribute="contacts">
	<p>
		<form:label path="studentName">Student</form:label>
		<form:select path="studentName">
			<c:forEach items="${students}" var="student">
				<option value="${student.id}">${student.firstName} ${student.lastName}</option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="address">Address:</form:label>
		<form:input path="address"/>
	</p>
	<p>
		<form:label path="city">City:</form:label>
		<form:input path="city"/>
	</p>
	<p>
		<form:label path="state">State:</form:label>
		<form:input path="state"/>
	</p>
	<button>Submit</button>
	</form:form>
	<br>
	<a href="/show">View students</a>
	<br>
	<a href="/">Create student</a>

</body>
</html>