package com.servletapp07.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/reg")
public class ResistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("uname");
	String upwd=request.getParameter("upwd");
	String uemail=request.getParameter("uemail");
	String umobile=request.getParameter("umobile");
	UserService us=new UserService();
	String status=us.resistration(uname, upwd, uemail, umobile);
	out.println("<html><body><center><font color='red' size='7'><b>");
	if(status.equals("success"))
	out.println("Resistration Success");
	else if(status.equals("failure"))
	out.println("Resistration Failure");
	else if(status.equals("existed"))
	out.println("User Existed Already");
	out.println("</b></center></body></html>");

		
		



	
	}

}
