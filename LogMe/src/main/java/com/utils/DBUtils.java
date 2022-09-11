package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static String uname="scott";
	private static String password="tiger";
	private static String url="jdbc:oracle:thin:@localhost:1521:orma";
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,uname,password);
			
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return con;
		
	}

}
