<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>The Code</title>
	</head>
	<body>	
	<div class="container">
		<h3>What is the code?</h3>
		
		<form action="/codeInput" method="POST">
			<input type="text" name="input">
			<br>
			<br>
			<button>Try Code</button>
			<p class="error"><c:out value="${error}"/></p>
		</form>
	</div>	
	</body>
</html>