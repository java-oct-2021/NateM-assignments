<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Info</title>
</head>
<body>
	<h1>View Language Information</h1>
	
	<h2><c:out value="${retrieveLanguage.name}"/></h2>
	<h2><c:out value="${retrieveLanguage.creator}"/></h2>
	<h2><c:out value="${retrieveLanguage.version}"/></h2>
	
	<p><a href="/edit/${retrieveLanguage.id}">Update</a></p>
	<form method="POST" action="/delete/${retrieveLanguage.id}">
	<input type="hidden" name="_method" value="delete">
	<button>Delete</button>
	
	</form>
</body>
</html>