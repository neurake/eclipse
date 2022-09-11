package com.user.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;



/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String upass=request.getParameter("pass");
		String ucontact=request.getParameter("contact");
		
		
		
		RequestDispatcher dispatcher=null;
		
//		PrintWriter  out =response.getWriter();
//		out.print(uname);
//		out.print(uemail);
//		out.print(upass);
//		out.print(ucontact);
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orma","scott","tiger");
		
			PreparedStatement pst=con.prepareStatement("insert into customer_tb(uname,upwd,uemail,umob)values(?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, upass);
			pst.setString(3, uemail);
			pst.setString(4, ucontact);
			
			int rowcount =pst.executeUpdate();
			dispatcher =request.getRequestDispatcher("registration.jsp");
			if(rowcount>0)
			{
				request.setAttribute("status", "success");
				
			}
			else
			{
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
