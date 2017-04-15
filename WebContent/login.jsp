<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
</head>
<body>
<center>
<h1>

Log In
</h1>
<form action="controller" method="get">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="uname"/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="pass"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Login" name="action"/></td>
<td><input type="submit" value="SignUp" name="action" /></td>
</tr>
</table>
</form>

</center>
</body>
</html>