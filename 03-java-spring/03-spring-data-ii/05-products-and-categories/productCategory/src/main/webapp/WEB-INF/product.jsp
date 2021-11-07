<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>

	<h1><c:out value="${product.name}"/></h1>
	<br>
	<h3><c:out value="${product.description}"/></h3>
	<h3><c:out value="${product.price}"/></h3>
	<br>
	
	<h2>Categories: </h2>
		<ul>
			<c:forEach items="${product.categories}" var="category">
				<li>${category.name}</li>
			</c:forEach>
		</ul>
	
	<form method="post" action="/addCategoryToProduct/${product.id}">
		<select name = "categories">
			<c:forEach items="${notContainedInProduct}" var="category">
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select>
		<button>Add Category To Product</button>
	</form>
</body>
</html>