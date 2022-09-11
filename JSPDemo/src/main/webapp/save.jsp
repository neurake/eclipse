<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.data.connection.*"%>
<%@page import="java.sql.*"%>





<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name=request.getParameter("fname");
	String email=request.getParameter("email");

	Connection con=DataConnection.getConn();
	Statement s=con.createStatement();
	int r=s.executeUpdate("insert into stud(fname,email)values('"+name+"','"+email+"')");
	if(r>0)
	{
		out.println("<h1 align=center>Record is inserted</h1>");
	}
	else
	{
		out.println("<h1 align=center>Record is not inserted</h1>");
	}


%>

</body>
</html>