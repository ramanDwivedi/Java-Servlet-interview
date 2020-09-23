package com.servletapp03.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletApp03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ServletContext context=getServletConfig().getServletContext();
	String lname=context.getServletContextName();
	String a=context.getInitParameter("a");
	String b=context.getInitParameter("b");
	context.setAttribute("c","cat");
	context.setAttribute("d","dog");
	out.println("<html><body><h1>");
	out.println("Logical Name:"+lname);
	out.println("a for:"+a);
	out.println("<br>");
	out.println("b for:"+b);
	out.println("<br>");
	out.println("c for..."+context.getAttribute("c"));
	out.println("<br>");
	out.println("d for..."+context.getAttribute("d"));
	out.println("<h1></body></html>");
	
	}

}
