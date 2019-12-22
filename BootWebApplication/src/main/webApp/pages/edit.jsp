<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="action" value="/update"></c:url>
<form:form action="${action}" method="post" modelAttribute="emp">
<table>

<tr>
<td><form:input type="hidden" path="id"/></td>
</tr>
<tr>
<td>First:</td>
<td><form:input type="text" path="fname"/></td>
</tr>
<tr>
<td>Last:</td>
<td><form:input type="text" path="lname"/></td>
</tr>
<tr>
<td>Email:</td>
<td><form:input type="text" path="email"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input type="password" path="password"/></td>
</tr>
<tr>
<td>Age(Approx):</td>
<td>
<form:select path="age">
<form:options items="${map}"/>
</form:select>
</td>
</tr>
<tr>
<td>Gender:</td>
<td><form:radiobutton path="gender" value="M" label="male"/>
<form:radiobutton path="gender" value="F" label="female"/></td>
</tr>
<tr>
<td>Phone:</td>
<td><form:input type="text" path="phone"/></td>
</tr>
<tr>
<td>Address:</td>
<td><form:input type="text" path="address"/></td>
</tr>
<tr>
<td><button>Register</button></td>
</tr>
</table>
</form:form>
</body>
</html>