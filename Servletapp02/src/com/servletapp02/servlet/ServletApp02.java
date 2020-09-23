package com.servletapp02.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletApp02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ServletConfig config=getServletConfig();
	String lname=config.getServletName();
	String driver=config.getInitParameter("driver");
	String system=config.getInitParameter("system");
	String password=config.getInitParameter("password");
	out.println("<html><body><h1>");
    out.println("Logical Name:"+lname+"<br><br>");
	out.println("Driver:"+driver+"<br><br>");
	out.println("System:"+system+"<br><br>");
	out.println("Password:"+password+"<br><br>");
	out.println("</h1></body><html>");




	}

}
