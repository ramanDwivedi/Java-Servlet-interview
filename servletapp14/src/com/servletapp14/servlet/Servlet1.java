package com.servletapp14.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String eid=request.getParameter("eid");
	String ename=request.getParameter("ename");
	HttpSession hs=request.getSession();
	hs.setAttribute("eid",eid);
	hs.setAttribute("ename",ename);
	RequestDispatcher rd = request.getRequestDispatcher("/form2.html");
	rd.forward(request, response);
	
	
	}

}
