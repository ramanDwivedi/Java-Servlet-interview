package com.servletapp18.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Myservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
String sname=request.getParameter("sname");
String sage=request.getParameter("sage");
String saddr=request.getParameter("saddr");
out.println("<html><body><center>");
out.println("<table border='1'>");
out.println("<tr>");
out.println("<td>Student Name</td><td>"+sname+"</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>Student Age</td><td>"+sage+"</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>Student Address</td><td>"+saddr+"</td>");
out.println("</tr>");
out.println("</table>");
out.println("</center></form></body></html>");

}

}
