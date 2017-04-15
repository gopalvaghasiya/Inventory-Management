<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.inventory.controller.item" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View</title>
</head>
<body>


<h1>Your Item </h1>

<table>

<%
	item []t=(item[])request.getAttribute("item2");
	for(int i=0;i<t.length;i++)
	{
		int code=t[i].getIcode();
		String ids=t[i].getIdes();
		int s=t[i].getIstock();
		int ms=t[i].getMstock();
		int c=t[i].getCost();
		int cat=t[i].getCat();
		%>
		<tr>
		<td><%=code%></td>
			<td><%=ids%></td>
				<td><%=s%></td>
					<td><%=ms%></td>
						<td><%=c%></td>
							<td><%=cat%></td>
		</tr>
		<% 
	}
	
%>
</table>
</body>
</html>