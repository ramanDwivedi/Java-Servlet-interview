package com.servletapp25.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletApp25 extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.println("<h1>RequestURI:"+request.getRequestURI()+"</h1>");
out.println("<h1>Context Path:"+request.getContextPath()+"</h1>");
out.println("<h1>Servlet Path:"+request.getServletPath()+"</h1>");
out.println("<h1>Path Info:"+request.getPathInfo()+"</h1>");
out.println("<h1>Query String:"+request.getQueryString()+"</h1>");








}

}
