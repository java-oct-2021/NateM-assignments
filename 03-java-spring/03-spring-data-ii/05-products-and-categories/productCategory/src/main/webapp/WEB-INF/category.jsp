<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Page</title>
</head>
<body>

	<h1><c:out value="${category.name}"/></h1>
	<br>
	
	<h2>Products: </h2>
		<ul>
			<c:forEach items="${category.products}" var="product">
				<li>${product.name}</li>
			</c:forEach>
		</ul>

	<form method="post" action="/addProductToCategory/${category.id}">
		<select name = "products">
			<c:forEach items="${notContainedInCategory}" var="product">
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select>
		<button>Add Product To Category</button>
	</form>
	<br>
	<a href="/newProduct">Back to create</a>
</body>
</html>