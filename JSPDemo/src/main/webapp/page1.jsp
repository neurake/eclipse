<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>


<h1 align="center" >Register</h1>
<br>
<form action="save.jsp" method="post">
<table border="1" align="center" width="900">

<tr>
<td>Enter Name</td>
<td><input type="text" name="fname"></td>
</tr>

<tr>
<td>Enter Email</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" name="b1" value="send data"></td>
</tr>


</table>



</form>
</body>
</html>