<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
		
	<font color="green">${msg}</font>
	<h2>Registration Form..!!</h2>
	<table>
		<form:form action="save" method="post" modelAttribute="user">
		<tr>
			<th>UserName:</th>
			<td><form:input path="userName"/> </td>
		</tr>
		<tr>
		<th>Email:</th>
		<td><form:input path="email"/></td>
		</tr>
		<tr>
		<th>Phone  Number:</th>
		<td><form:input path="phno"/></td>
		</tr>
		<tr>
		<th>Country</th>
		<td><form:select path="country" items="${countryList}"></form:select> </td>
		</tr>
		<tr>
		<td><input type="reset" value="clear"/></td>
		<td><input type="submit" value="Register"/></td>
		</tr>
		</form:form>
	</table>
</body>
</html>