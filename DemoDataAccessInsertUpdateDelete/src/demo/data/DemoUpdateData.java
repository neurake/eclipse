package demo.data;

import java.sql.*;
import java.util.Scanner;
class DemoUpdatedata
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rno:");
			int rno=sc.nextInt();
			System.out.println("Enter Sname:");
			String sname=sc.next();
			System.out.println("Enter S address:");
			String saddress=sc.next();
			try
			{
					String url="jdbc:mysql://localhost:3306/student_db";
					String uname="root";
					String pwd="Vishal@5676";
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pwd);
					PreparedStatement pst=con.prepareStatement("update stud_details set sname=? ,saddress=? where rno=?;");
					pst.setInt(3,rno);
					pst.setString(1,sname);
					pst.setString(2,saddress);
					
					int count=pst.executeUpdate();
					if(count>0)
					{
							System.out.println("Record Updated Successfully");
					}
					else
					{
							System.out.println("Updation Failed");
					}
					
					pst.close();
					con.close();
						
					
				}
				catch(Exception ex)
				{
						System.out.println(ex);
				}
			}
}