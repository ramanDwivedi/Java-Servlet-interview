package com.servletapp21.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
			
			
			
			
	
	
	}

}
