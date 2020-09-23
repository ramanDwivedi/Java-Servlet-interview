package com.servletapp08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String sid = request.getParameter("sid");
	String sname = request.getParameter("sname");
	String saddr = request.getParameter("saddr");

	StudentService stdService = new StudentService();
	String status = stdService.update(sid, sname, saddr);
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Durga Software Solutions</h2>");
	out.println("<h3>Student Updation Status</h3>");
	out.println("<font color='red' size='6'>");
	out.println("<b>");
	if(status.equals("success")) 
	out.println("Student Updated Successfully");
	else
	out.println("Student Updation Failure");
	out.println("</b></font>");
	out.println("<h3><a href='./updateform.html'>|Student Update Form|</a>");
	out.println("</body></html>");








}
}
