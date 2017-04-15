<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ragistrection</title>
</head>
<body>

<center>
<h1>
Ragistrection
</h1>
<form action="controller" method="get">
<table>

<tr>
<td>User Id</td>
<td><input type="text" name="uid"/></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="reg_uname"/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="reg_pass"/></td>
</tr>

<tr>
<td>First Name</td>
<td><input type="text" name="fname"/></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lname"/></td>
</tr>

<tr>
<td>Mobile Number</td>
<td><input type="text" name="mno"/></td>
</tr>



<tr>
<td></td>
<td><input type="submit" value="Ragister" name="action"/></td>
</tr>



</table>


</form>

</center>
</body>
</html>