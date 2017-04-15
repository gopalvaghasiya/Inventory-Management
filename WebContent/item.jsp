<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item</title>
</head>
<body>

<center>
<form action="controller" method="get">

<table>

<tr>
<td>Item Code</td>
<td><input type="text" name="icode"/></td>
</tr>


<tr>
<td>Item Description</td>
<td><input type="text" name="ides"/></td>
</tr>

<tr>
<td>Item Stock</td>
<td><input type="text" name="istock"/></td>
</tr>

<tr>
<td>Minimum Stock</td>
<td><input type="text" name="Mstock"/></td>
</tr>

<tr>
<td>Cost</td>
<td><input type="text" name="cost"/></td>
</tr>

<tr>
<td>Category</td>
<td><input type="text" name="cat"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" name="action" value="add_item"/></td>
<td><input type="submit" name="action" value="show all item"/></td>
<td><input type="submit" name="action" value="update item"/></td>
<td><input type="submit" name="action" value="delete item"/></td>
</tr>
</table>

</form>


</center>

</body>
</html>