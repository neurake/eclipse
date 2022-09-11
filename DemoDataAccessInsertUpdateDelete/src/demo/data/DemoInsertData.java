package demo.data;
import java.sql.*;
import java.util.Scanner;
class DemoInsertdata
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
					PreparedStatement pst=con.prepareStatement("insert into stud_details values(?,?,?) ");
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

					pst.close();
					con.close();
						
					
				}
				catch(Exception ex)
				{
						System.out.println(ex);
				}
			}
}