<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book</title>
</head>
<body>
	<table>
		<thead>
		<tr>
			<th>Book ID</th>
			<th>Book NAME</th>
			<th>Book PRICE</th>
		</tr>
		
		</thead>
	
	<tbody>
	
	<c:forEach items="${books}" var="book">
	
		<td>${book.id}</td>
		<td>${book.bookName}</td>
		<td>${book.price}</td>
	</c:forEach>
	
	</tbody>
	
	</table>
</body>
</html>
