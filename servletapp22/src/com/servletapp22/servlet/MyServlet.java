package com.servletapp22.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
public MyServlet() {
	super();
    }
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
response.setContentType("img/jpg");
PrintWriter out=response.getWriter();
out.println("<h1>Hello From MyServlet</h1>");
}

}
