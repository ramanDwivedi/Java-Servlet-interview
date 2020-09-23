package com.servletapp05.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletApp05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration<String> e=request.getHeaderNames();
		out.println("<html>");
		out.println("<body><center><br><br>");
		out.println("<table border='1' bgcolor='lightblue'>");
		out.println("<tr><td align='center'><h3>Header Name</h3></td><td align='center'><h3>Header Values</h3></td></tr>");
		while(e.hasMoreElements())
		{
			String header_name=(String)e.nextElement();
			String header_value=request.getHeader(header_name);
			out.println("<tr><td>"+header_name+"</td><td>"+header_value+"</td></tr>");
		}
		out.println("</table></center></body></html>");
		
	}

}
