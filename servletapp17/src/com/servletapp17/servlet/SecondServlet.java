package com.servletapp17.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
String sname=request.getParameter("sname");
String sid=request.getParameter("sid");
String saddr=request.getParameter("saddr");
String sage=request.getParameter("sage");
out.println("<html><body bgcolor='lightyellow'>");
out.println("<center><b><br><br>");
out.println("Welcome To Student Application");
out.println("<br><br>");
out.println("<center>");
out.println("<form method='post' action='./third'>");
out.println("<table>");
out.println("<tr>");
out.println("<td>Student Name</td>");
out.println("<td><input type='hidden' name=sname value='"+sname+"'></td></tr>");
out.println("<tr>");
out.println("<td>Student Id</td>");
out.println("<td><input type='hidden' name=sid value='"+sid+"'></td></tr>");
out.println("<tr>");
out.println("<td>Student Address</td>");
out.println("<td><input type='hidden' name=saddr value='"+saddr+"'></td></tr>");
out.println("<tr>");
out.println("<td>Student Age</td>");
out.println("<td><input type='hidden' name=sage value='"+sage+"'></td></tr>");
out.println("<tr>");
out.println("<td>Student Mobile</td>");
out.println("<td><input type='text' name='smobile'></td></tr>");
out.println("<tr>");
out.println("<td><input type='submit' value='submit'></td></tr>");
out.println("</center></form></body></html>");



















}

}
