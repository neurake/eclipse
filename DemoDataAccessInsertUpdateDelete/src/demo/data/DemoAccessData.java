package demo.data;
import java.sql.*;
import java.util.Scanner;


public class DemoAccessData {

	public static void main(String[] args) 
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
				PreparedStatement pst=con.prepareStatement("select * from stud_details where rno=?");
				pst.setInt(1,rno);
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
