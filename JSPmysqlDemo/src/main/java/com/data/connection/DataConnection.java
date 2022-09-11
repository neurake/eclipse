package com.data.connection;
import java.sql.*;
public class DataConnection {
	public static Connection getConn()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Vishal@5676");
			return con;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		return con;
		
	}

}
