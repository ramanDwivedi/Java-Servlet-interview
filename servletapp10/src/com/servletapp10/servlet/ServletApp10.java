package com.servletapp10.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletApp10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sname = request.getParameter("sname");
		String squal = request.getParameter("squal");
		String scourse = request.getParameter("scourse");
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");
		if(!(squal.equalsIgnoreCase("BTech") || squal.equalsIgnoreCase("MCA") || squal.equalsIgnoreCase("MTECH")))
			response.sendError(510, "You are not eligible for the Course "+scourse);
		
			else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h2>Durga Software Solutions</h2>");
				out.println("<h3>Student Course Registration Status</h3>");
				out.println("<table border='1'>");
				out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
				out.println("<tr><td>Student Qualification</td><td>"+squal+"</td></tr>");
				out.println("<tr><td>Student Course</td><td>"+scourse+"</td></tr>");
				out.println("<tr><td>Student Email Id</td><td>"+semail+"</td></tr>");
				out.println("<tr><td>Student Mobile</td><td>"+smobile+"</td></tr>");
				out.println("<tr><td>Registration Status</td><td>SUCCESS</td></tr>");
			}
}
		

}
