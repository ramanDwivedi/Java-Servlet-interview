package com.servletapp24.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String sname=request.getParameter("sname");
	String spwd=request.getParameter("spwd");
	String sage=request.getParameter("sage");
	String semail=request.getParameter("semail");
	String smobile=request.getParameter("smobile");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html><body><center>");
	out.println("<tr><td>Student name</td><td>:"+sname+"</td></tr>");
	out.println("<tr><td>Student Password</td><td>:"+spwd+"</td></tr>");
	out.println("<tr><td>Student Age</td><td>:"+sage+"</td></tr>");
	out.println("<tr><td>Student Email</td><td>:"+semail+"</td></tr>");
	out.println("<tr><td>Student Mobile</td><td>:"+smobile+"</td></tr>");
	out.println("</center></body></html>");




	
	
	}

}
