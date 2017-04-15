<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
</head>
<body>

<center>

<form action="controller" method="get">
<table>
<tr>
<td>Category Id</td>
<td><input type="text" name="cid"/></td>

</tr>

<tr>
<td>Category Name</td>
<td><input type="text" name="cname"/></td>

</tr>

<tr>
<td></td>
<td><input type="submit" name="action" value="catadd"/></td>

</tr>

</table>

</form>

</center>

</body>
</html>