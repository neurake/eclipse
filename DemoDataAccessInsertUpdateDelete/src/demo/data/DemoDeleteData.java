package demo.data;

import java.sql.*;
import java.util.Scanner;
class DemoDeletedata
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rno:");
			int rno=sc.nextInt();
			
			
			try
			{
					String url="jdbc:mysql://localhost:3306/student_db";
					String uname="root";
					String pwd="Vishal@5676";
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pwd);
					PreparedStatement pst=con.prepareStatement("delete from stud_details  where rno=?;");
					pst.setInt(1,rno);
					
					
					int count=pst.executeUpdate();
					if(count>0)
					{
							System.out.println("Record Deleted Successfully");
					}
					else
					{
							System.out.println("Deletion Failed");
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