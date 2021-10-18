<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
<h3>You have visited <a href="/">Your Server</a> <c:out value="${showCount}"/> times.</h3>
<br>
<p><a href="/">Take another visit?</a></p>
<br>
<h5><a href="/reset">Reset counter</a></h5>
</body>
</html>