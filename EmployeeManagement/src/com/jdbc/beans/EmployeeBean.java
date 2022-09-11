package com.jdbc.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeBean {
	
	private int Eid;
	private String Ename;
	private String Eaddress;
	private int Esalary;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEaddress() {
		return Eaddress;
	}
	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}
	public int getEsalary() {
		return Esalary;
	}
	public void setEsalary(int esalary) {
		Esalary = esalary;
	}
	public EmployeeBean getEmployee(int id)
	{
		
		
		try
		{
				String url="jdbc:mysql://localhost:3306/employee";
				String uname="root";
				String pwd="Vishal@5676";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,uname,pwd);
				PreparedStatement pst=con.prepareStatement("select * from emp_details where eid=?");
				pst.setInt(1,eid);
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				else
				{
						System.out.println("Data not accessed");
				}
					
				rs.close();
				pst.close();
				con.close();
				
			}
			catch(Exception ex)
			{
					System.out.println(ex);
			}
		
	}

}














