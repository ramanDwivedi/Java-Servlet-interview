package com.servletapp16.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String accNo=request.getParameter("accNo");
	String accName=request.getParameter("accName");
	HttpSession hs=request.getSession();
	hs.setAttribute("accNo",accNo);
	hs.setAttribute("accName",accName);
	out.println("<html><body bgcolor='cyan'><br><br>");
	out.println("<center><h1>Deposite Form</h1></center><br><br><hr><br><br>");
	out.println("<center><form method='post' action='"+response.encodeUrl("./second")+"'>");
	out.println("<table>");
	out.println("<tr><td>Account Type</td>");
	out.println("<td><input type='text' name='accType'/></td></tr>");
	out.println("<tr><td>Account Branch</td>");
	out.println("<td><input type='text' name='accBranch'/></td></tr>");
	out.println("<tr><td><input type='submit' value='Next'/></td></tr>");
	out.println("</center></form></body></html>");
	
	

	


	
	
	
	
	
	}

}
