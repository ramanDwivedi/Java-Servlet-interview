package com.servletapp21.servlet;

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
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("uname");
	String upwd=request.getParameter("upwd");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mobile");
	out.println("<html><body bgcolr='lightyellow'>");
	out.println("<b><font size='7'><br><br>");
	out.println("Name..."+uname+"<br><br>");
	out.println("Password..."+upwd+"<br><br>");
	out.println("Email..."+email+"<br><br>");
	out.println("Mobile..."+mobile+"<br><br>");
	out.println("</font></b></body></html>");
}

}
