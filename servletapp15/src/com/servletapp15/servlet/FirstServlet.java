package com.servletapp15.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String pid=request.getParameter("pid");
	String pname=request.getParameter("pname");
	Cookie c1=new Cookie("pid",pid);
	Cookie c2=new Cookie("pname",pname);
	response.addCookie(c1);
	response.addCookie(c2);
	RequestDispatcher rd=request.getRequestDispatcher("/form2.html");
	rd.forward(request,response);
	

	
	
	}

}
