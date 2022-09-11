package com.data.connection;
import java.sql.*;
public class DataConnection {

	public static Connection getConn()
	{
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb","root","");
			return con;
				
		}
		catch(Exception ex)
		{
			System.out.println(" "+ex.getMessage());
			
		}
		return con;
	}
}
