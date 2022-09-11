package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner; 

import com.beans.Student;
import com.utils.DBUtils;

public class StudentDao {

//	public Student getStudent(int sid)
//	{
//		Student s=null;
//		Connection con=DBUtils.getConnection();
//		try
//		{
//			Statement smt=con.createStatement();
//			ResultSet rs=smt.executeQuery("select *  from student_tb where stud_id="+sid);
//			if(rs.next())
//			{
//				s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
//				
//			}
//			rs.close();
//			smt.close();
//			con.close();
//			
//			}
//		catch(SQLException ex)
//		{
//			System.out.println(ex);
//		}
//		return s;
//	}
//	
	
	public Student getStudent(int sid)
	{
		Student s=null;
		Connection con=DBUtils.getConnection();
		try
		{
			String query="select *  from student_tb where stud_id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,sid);
			ResultSet rs=pst.executeQuery(query);
			if(rs.next())
			{
				s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			}
			rs.close();
			pst.close();
			con.close();
			
			}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return s;
	}
	
	
	
	public Student insertStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rno:");
		int rno=sc.nextInt();
		System.out.println("Enter Sname:");
		String sname=sc.next();
		System.out.println("Enter S address:");
		String saddress=sc.next();
		Student s=null;
		Connection con=DBUtils.getConnection();
		try
		{
			
			PreparedStatement pst=con.prepareStatement("insert into student_tb values(?,?,?) ");
			pst.setInt(1,rno);
			pst.setString(2,sname);
			pst.setString(3,saddress);
			int count=pst.executeUpdate();
			if(count>0)
			{
					System.out.println("Record Inserted Successfully");
			}
			else
			{
					System.out.println("Insertion Failed");
			}
			con.commit();
			pst.close();
			con.close();
			
			}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return s;
		
	}
	
//	public boolean insertStudent(Student stud)
//	{
//		Connection con=DBUtils.getConnection();
//		boolean flag=false;
//		try
//		{
//			String query="insert into student_tb values("+stud.getStudId()+",'"+stud.getStudname()+"','"+stud.getStudAddress()+"')";
//			Statement smt=con.createStatement();
//			int count=smt.executeUpdate(query);
//			if(count>0)
//				flag=true;
//			con.commit();
//			smt.close();
//			con.close();
//				
//			
//		}
//		catch(Exception ex)
//		{
//			System.out.println(ex);
//		}
//		return flag;
//	}
//	
	public boolean insertStudent(Student stud)
	{
		Connection con=DBUtils.getConnection();
		boolean flag=false;
		try
		{
			String query="insert into student_tb values("+stud.getStudId()+",'"+stud.getStudname()+"','"+stud.getStudAddress()+"')";
			Statement smt=con.createStatement();
			int count=smt.executeUpdate(query);
			if(count>0)
				flag=true;
			con.commit();
			smt.close();
			con.close();
				
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return flag;
	}
	
	
	public boolean updateStudent(Student stud)
	{
		Connection con=DBUtils.getConnection();
		boolean flag=false;
		try
		{
			String query="update student_tb set stud_name='"+stud.getStudname()+"',stud_address='"+stud.getStudAddress()+"'where stud_id="+stud.getStudId(); 
			Statement smt=con.createStatement();
			int count=smt.executeUpdate(query);
			if(count>0)
				flag=true;
			con.commit();
			smt.close();
			con.close();
				
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return flag;
	}
	public boolean deleteStudent(int sid)
	{
		Connection con=DBUtils.getConnection();
		boolean flag=false;
		try
		{
			String query="delete from student_tb where stud_id="+sid; 
			Statement smt=con.createStatement();
			int count=smt.executeUpdate(query);
			if(count>0)
				flag=true;
			con.commit();
			smt.close();
			con.close();
				
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return flag;
	}
}
