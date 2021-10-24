<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Language</title>
</head>
<body>

	<h1>View Language</h1>
		
	<h2><c:out value="${viewLang.name}"/></h2>
	
	<h2><c:out value="${viewLang.creator}"/></h2>
	
	<h2><c:out value="${viewLang.currentVersion}"/></h2>
	
	
	<p><a href="/edit/${viewLang.id}">Update</a></p>
	<form method="POST" action="/delete/${viewLang.id}">
	<input type="hidden" name="_method" value="delete">
	<button>Delete Language</button>
	</form>
	
	
	<p><a href="/">Home</a></p>
</body>
</html>