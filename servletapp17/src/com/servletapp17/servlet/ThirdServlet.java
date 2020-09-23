package com.servletapp17.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ThirdServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String sname=request.getParameter("sname");
String sid=request.getParameter("sid");
String saddr=request.getParameter("saddr");
String sage=request.getParameter("sage");
String smobile=request.getParameter("smobile");
out.println("<html><body bgcolor='lightyellow'>");
out.println("<center><b><br><br>");
out.println("<tr><td>Student Name</td><td>:"+sname+"</td></tr>");
out.println("<tr><td>Student Id</td><td>:"+sid+"</td></tr>");
out.println("<tr><td>Student Address</td><td>:"+saddr+"</td></tr>");
out.println("<tr><td>Student Age</td><td>:"+sage+"</td></tr>");
out.println("<tr><td>Student Mobile</td><td>:"+smobile+"</td></tr>");
out.println("</center></body></html>");












}

}
