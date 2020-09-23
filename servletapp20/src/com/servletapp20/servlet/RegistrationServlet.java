package com.servletapp20.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String eid=request.getParameter("eid");
String ename=request.getParameter("ename");
String eage=request.getParameter("eage");
String eemail=request.getParameter("eemail");
String emobile=request.getParameter("emobile");
out.println("<html><body><font color='red'>");
out.println("<h2>Durga Software Solution</h2>");
out.println("<h3>Employee RegistrationForm</h3>");
out.println("</font>");
out.println("<table border='1'>");
out.println("<tr><td>Employee Id</td><td>"+eid+"</td></tr>");
out.println("<tr><td>Employee Name</td><td>"+ename+"</td></tr>");
out.println("<tr><td>Employee Age</td><td>"+eage+"</td></tr>");
out.println("<tr><td>Employee Email</td><td>"+eemail+"</td></tr>");
out.println("<tr><td>Employee MObile</td><td>"+emobile+"</td></tr>");
out.println("</table></body></html>");

















}

}
