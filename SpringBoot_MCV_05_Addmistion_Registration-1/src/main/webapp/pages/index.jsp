<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.error {
	color: red
}
</style>

</head>
<body>
		<h1>Student Registration From</h1>	
		<form:form action="register" modelAttribute="student" method="post">
			
				<table>
					<tr>
						<td>Student Name :</td>
						<td><form:input path="name"/><form:errors path="name" cssClass="error"/></td>
					</tr>
	
					<tr>
						<td>Father Name :</td>
						<td><form:input path="fname"/></td>
					</tr>
					<tr>
						<td>Phone Number :</td>
						<td><form:input path="phone"/></td>
					</tr>
					
					<tr>
						<td>Email Id :</td>
						<td><form:input path="gmail"/></td>
					</tr>
					
					<tr>
						<td>Age :</td>
						<td><form:input path="age"/></td>
					</tr>
					 
					 <tr>
					 	<td>Govt Id</td>
					 	<td><form:input path="gId"/></td>
					 </tr>
					 <tr>
					 	<td></td>
					 	<td><input type="submit" value="Register"></td>
					 </tr>
					 
				
				</table>
			
		
		
		</form:form>
</body>
</html>