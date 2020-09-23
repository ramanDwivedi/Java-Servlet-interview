package com.servletapp18.filter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyFilter implements Filter {

    public MyFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String sname_Error="",sage_Error="",saddr_Error="";
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("sname");
		String sage=request.getParameter("sage");
		String saddr=request.getParameter("saddr");
		boolean flag=true;
		if(sname==null || sname.equals(""))
		{
		sname_Error="sid is required";
		flag=false;
		}
		else
			flag=true;
		if(sage==null || sage.equals(""))
		{	sage_Error="sage is required";
           flag=false;
		}
		else
			flag=true;
		if(saddr==null || saddr.equals(""))
		{
			saddr_Error="saddr is required";
		   flag=false;
		}
		else
			flag=true;
		if(flag==false)
		{
			out.println("<html><body><center>");
			out.println("<form method='post' action='./ms'>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Student Name</td>");
            out.println("<td><input type='text' name='sname' value='"+sname+"'/></td>");
            out.println("<td><font color='red' size='5'>"+sname_Error+"</font></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Student Age</td>");
            out.println("<td><input type='text' name='sage' value='"+sage+"'/></td>");
            out.println("<td><font color='red' size='5'>"+sage_Error+"</font></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Student Adress</td>");
            out.println("<td><input type='text' name='saddr' value='"+saddr+"'/></td>");
            out.println("<td><font color='red' size='5'>"+saddr_Error+"</font></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='submit' value='Registration'/></td>");
            out.println("</tr>");
            out.println("</table></center></form></body></html>");
}
		else
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
