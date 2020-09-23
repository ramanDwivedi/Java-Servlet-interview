package com.servletapp29.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test1")
public class ServletApp29 extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
PrintWriter out=response.getWriter();
out.println("<h1>This is first servlet</h1>");
RequestDispatcher rd=request.getRequestDispatcher("/test2");
rd.forward(request,response);



}

}
