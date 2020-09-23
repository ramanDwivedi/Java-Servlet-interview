package com.servletapp07.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	UserService us=new UserService();
	String uname=request.getParameter("uname");
	String  upwd=request.getParameter("upwd");
	String status=us.checkLogin(uname, upwd);
	out.println("<html><body><center><font color='red' size='7'><b>");
   if(status.equals("success"))
	out.println("Login Success");
   else if(status.equals("failure"))
		out.println("Login Failure");
	out.println("</b></font></center></body></html>");
	
	}

}
