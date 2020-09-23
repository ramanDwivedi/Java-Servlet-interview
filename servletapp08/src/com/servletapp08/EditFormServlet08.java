package com.servletapp08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditFormServlet08 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sid = request.getParameter("sid");
		StudentService stdService = new StudentService();
		StodentTo sto = stdService.getStudent(sid);
		if(sto == null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Durga Software Solutions</h2>");
			out.println("<h3>Student EditForm Status</h3>");
			out.println("<b>Student Not Existed</b>");
			out.println("</font>");
			out.println("<h3><a href='./updateform.html'>|Student Update Form|</a></h3>");
			out.println("</body></html>");
		}
		else
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Durga Software Solutions</h2>");
			out.println("<h3>Student EditForm</h3>");
			out.println("<form method='POST' action='./update'>");
			out.println("<table>");
			out.println("<tr><td>Student Id</td><td>:"+sid+"</td></tr>");
			out.println("<input type='hidden' name='sid' value='"+sid+"'/>");
			out.println("<tr><td>Student Name</td><td><input type='text' name='sname' value='"+sto.getSname()+"'/></td></tr>");
			out.println("<tr><td>Student Address</td><td><input type='text' name='saddr' value='"+sto.getSaddr()+"'/></td></tr>");
			out.println("<tr><td><input type='submit' value='Update'/></td></tr>");
			out.println("</table></form></body></html>");

		}






		}







	}


