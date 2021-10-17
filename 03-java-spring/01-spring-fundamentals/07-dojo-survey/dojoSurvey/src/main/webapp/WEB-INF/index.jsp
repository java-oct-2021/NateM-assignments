<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<form action="/dashboard" method="POST">
	<p> Name: <input type="text" name="name"></p>
	<p> Location:
		<select name="location">
		<option value="philadelphia">Philadelphia</option>
		<option value="boston">Boston</option>
		<option value="portland">Portland</option>
		</select>
		</p>
	<p> Favorite Language:
		<select name="favLanguage">
		<option value="python">Python</option>
		<option value="java">Java</option>
		<option value="C++">C++</option>
		</select>
		</p>
	<p> Comments: <input type="text" name="comment"></p>
		<p><button>Submit</button></p>
	</form>
	
</body>
</html>