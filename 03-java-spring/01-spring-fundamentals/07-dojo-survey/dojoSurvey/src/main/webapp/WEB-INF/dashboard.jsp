<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<div>
		<p>Name: <c:out value="${name }"/></p>
		<p>Location: <c:out value="${location}"/></p>
		<p>Favorite Language: <c:out value="${favLanguage}"/></p>
		<p>Comments: <c:out value="${comment}"/></p>
	</div>
	<a href="/">Return Home</a>
	
</body>
</html>