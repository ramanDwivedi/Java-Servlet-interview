package com.servletapp14.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String eemail=request.getParameter("eemail");
	String emobile=request.getParameter("emobile");
	HttpSession hs=request.getSession();
	String eid=(String)hs.getAttribute("eid");
	String ename=(String)hs.getAttribute("ename");
	float esal=(Float)hs.getAttribute("esal");
	String eaddr=(String)hs.getAttribute("eaddr");
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Durga Software Solutions</h2>");
	out.println("<h3>Employee Registration Details</h3>");
	out.println("<table border='1'>");
	out.println("<tr><td>Employee Id</td><td>"+eid+"</td></tr>");
	out.println("<tr><td>Employee Name</td><td>"+ename+"</td></tr>");
	out.println("<tr><td>Employee Salary</td><td>"+esal+"</td></tr>");
	out.println("<tr><td>Employee Address</td><td>"+eaddr+"</td></tr>");
	out.println("<tr><td>Employee Email Id</td><td>"+eemail+"</td></tr>");
	out.println("<tr><td>Employee Mobile No</td><td>"+emobile+"</td></tr>");
	out.println("</table></body></html>");

	
	}

}
