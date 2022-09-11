<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.data.connection.*" %>
    <%@page import="java.sql.*" %>
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
int r=s.executeUpdate("insert into studjsp (fname,email)values('"+name+"','"+email+"')");
if(r>0)
{
	out.println("<h1 align=center>The Record is inserted");
}
else
{
	out.println("<h1 align=center>The Record is not inserted");
}


%>

</body>
</html>