package com.servletapp18.servlet;

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
	PrintWriter out = response.getWriter();
	String uname = request.getParameter("uname");
	String upwd = request.getParameter("upwd");
	int uage = Integer.parseInt(request.getParameter("uage"));
	String uemail = request.getParameter("uemail");
	String umobile = request.getParameter("umobile");
    out.println("<html>");
    out.println("<body>");
    out.println("<h2>Durga Software Solutions</h2>");
    out.println("<h3>User Registration Details</h3>");
    out.println("<table border='1'>");
    out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
    out.println("<tr><td>User Password</td><td>"+upwd+"</td></tr>");
    out.println("<tr><td>User Age</td><td>"+uage+"</td></tr>");
    out.println("<tr><td>User Email</td><td>"+uemail+"</td></tr>");
    out.println("<tr><td>User Mobile</td><td>"+umobile+"</td></tr>");
    out.println("</table></body></html>");











	


}

}
