<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.inventory.controller.item" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
<form action="controller" method="get">
<center>
<table>
<tr>

<select name="Item_code" >
<%
int arr[]=(int[])request.getAttribute("icode2");

for(int i=0;i<arr.length;i++)
{
	int icode=arr[i];
	
%>


  <option value="<%=icode%>"><%=icode %></option>
  

<%

}
%>
</select>

<% for(int i=0;i<arr.length;i++)
{
	int icode=arr[i];
	
%>


  <input type="checkbox" name="<%=icode%>"  value="<%=icode%>"/><%=icode %>
  

<%

}
%>




<td><input type="submit" name="action" value="delete"/></td>
<td><input type="submit" name="action" value="multi_delete"/></td>
</tr>
</center>
</form>
</body>
</html>