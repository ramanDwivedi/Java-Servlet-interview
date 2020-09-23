package com.servletapp16.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String accType=request.getParameter("accType");
	String accBranch=request.getParameter("accBranch");
	HttpSession hs=request.getSession();
	hs.setAttribute("accType",accType);
	hs.setAttribute("accBranch",accBranch);
	out.println("<html><body bgcolor='cyan'><br><br>");
	out.println("<center><h1>Deposite Form</h1></center><br><br><hr><br><br>");
	out.println("<center><form method='post' action='"+response.encodeUrl("./deposit")+"'>");
	out.println("<table>");
	out.println("<tr><td>Depositor name</td>");
	out.println("<td><input type='text' name='depName'/></td></tr>");
	out.println("<tr><td>Deposit Amount</td>");
	out.println("<td><input type='text' name='depAmount'/></td></tr>");
	out.println("<tr><td><input type='submit' value='Next'/></td></tr>");
	out.println("</center></form></body></html>");


	




	
	
	}

}
