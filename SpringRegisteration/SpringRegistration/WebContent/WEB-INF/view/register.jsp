<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error{
 color:#EF1313;
 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h3>Registration Form <h3></center>
<form:form action="register" method="post" modelAttribute="user">

<table border="0" width="90%">
<tr>
<td>User Id:</td>
<td><form:input path="userId"/></td>
<td><form:errors path="userId"></form:errors></td>
</tr>


<tr>
<td>User Name:</td>
<td><form:input path="userName"/></td>
<td><form:errors path="userName"></form:errors></td>
</tr>

<tr>
<td>Password:</td>
<td><form:input path="password"/></td>
<td><form:errors path="password"></form:errors></td>
</tr>

<tr>
<td>Contact:</td>
<td><form:input path="contact"/></td>
<td><form:errors path="contact"></form:errors></td>
</tr>


<tr>
<td>Email:</td>
<td><form:input path="email"/></td>
<td><form:errors path="email"></form:errors></td>
</tr>

<tr>
<td>Address:</td>     
<td><form:input path="address"/></td>
<td><form:errors path="address"></form:errors></td>
</tr>

<td align="center"><input type="submit" value="register"></td>
</table>
</form:form>
</body>
</html>

