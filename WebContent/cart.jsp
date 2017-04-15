<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.inventory.controller.item" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
</head>
<body>
<center>

<form action="controller" method="get">

<table>

<tr>
<td>Select Category</td>
<td><select name="cat" >

<option value="electronics">electronics</option>
<option value="furniture">furniture</option>
<option value="education">education</option>

</select></td>
</tr>
</table>


<br/>

<table>
<tr>

<td>Item Code</td>
<td>Item Description</td>
<td>Item Cost</td>
<td>Item Category</td>
<td>Add To Cart</td>
</tr>
<%

item temp[]=(item[])request.getAttribute("items");
for(int i=0;i<temp.length;i++)
{
	int code=0;
	String ids=null;
	int cost=0;
	int cat=0;
	
	if(temp[i].getIstock()>=temp[i].getMstock())
	{
		code=temp[i].getIcode();
		ids=temp[i].getIdes();
		cost=temp[i].getCost();
		cat=temp[i].getCat();
		
	}
	%>
	
	<tr>
	<td><%=code %></td>
	<td><%=ids %></td>
	<td><%=cost %></td>
	<td><%=cat %></td>
	<td><input type="submit" name="action" value="<%=code %>"/></td>
	</tr>
	
	
	<%
}

%>

<tr>
<td><input type="submit" name="action" value="viewcat"/></td>
<td><input type="submit" name="action" value="viewcart"/></td>
</tr>

</table>
</form>

</center>
</body>
</html>