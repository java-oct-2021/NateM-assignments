<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<table>
		<thead>
		<tr>
			<td>Name</td>
			<td>Creator</td>
			<td>Version</td>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${allLanguages}" var="lang">
			<tr>
			<td><a href="/show/${lang.id}">${lang.name})</a></td>
			<td><a href="/show/${lang.id}">${lang.creator})</a></td>
			<td><a href="/show/${lang.id}">${lang.version})</a></td>
			<td><a href="/edit/${lang.id}">Edit</a> | <a href="/delete/${lang.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<form:form action="/" method="POST" modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>
		</p>
		<button>Submit</button>
	</form:form>
</body>
</html>