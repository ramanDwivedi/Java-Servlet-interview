package com.servletapp20.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class RegistrationFilter implements Filter {

    public RegistrationFilter() {
    }
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String eid_Err_Msg="",ename_Err_Msg="",eage_Err_Msg="",eemail_Err_Msg="",emobile_Err_Msg="";
		boolean flag=true;
		String eid=request.getParameter("eid");
		String ename=request.getParameter("ename");
		String eage=request.getParameter("eage");
		String eemail=request.getParameter("eemail");
		String emobile=request.getParameter("emobile");
		if(eid==null || eid.equals(""))
		{
			eid_Err_Msg="Employee Id is Required";
		flag=false;}
		else
		{
			if(!eid.startsWith("DSS"))
			{
				eid_Err_Msg="Employee Id must be in DSS-NNN Format";
				flag=false;
			}
		}
		if(ename==null || ename.equals(""))
		{
			ename_Err_Msg="Employee Name is Required";
			flag=false;
		}
		else
			flag=true;
		if(eage==null || eage.equals(""))
		{
			eage_Err_Msg="Employee Age is required";
			flag=false;
		}
		else
		{int age=Integer.parseInt(eage);
			if(age<18 && age>30)
			{
				eid_Err_Msg="Employee Age must be in 18 to 30 years";
			    flag=false;
				}
			}
		if(eemail==null || eemail.equals(""))
				{
			    eemail_Err_Msg="Employee Email is Required";
				flag=false;
			}
		else
		{
			if(!eemail.endsWith("@durgasoft.com"))
			{
				eemail_Err_Msg="Employee Email is Invalid";
				flag=false;
				}}
		if(emobile==null || emobile.equals(""))
		{
			emobile_Err_Msg="Employee Mobile Num is Required";
			flag=false;}
		else
		{
			if(!emobile.startsWith("91-"))
			{
				emobile_Err_Msg="Employee Mobile Num is Invalid";
				flag=false;
			}
			
		}
		if(flag==false)
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<font color='red>");
			out.println("<h2>Durga Software Solution</h2>");
			out.println("<h3>Employee Registration Form</h3></font>");
			out.println("<font color='blue' size='5'>");
			out.println(eid_Err_Msg+"<br>");
			out.println(ename_Err_Msg+"<br>");
			out.println(eage_Err_Msg+"<br>");
			out.println(eemail_Err_Msg+"<br>");
			out.println(emobile_Err_Msg+"<br>");
			out.println("<font>");
			out.println("<form method='post' action='./reg'>");
			out.println("<table>");
			out.println("<tr><td>Employee Id</td><td><input type='text'name='eid'value='"+eid+"'/></td><td>"+eid_Err_Msg+"</td></tr>");
			out.println("<tr><td>Employee Name</td><td><input type='text'name='ename'value='"+ename+"'/></td><td>"+ename_Err_Msg+"</td></tr>");
			out.println("<tr><td>Employee Age</td><td><input type='text'name='eage'value='"+eage+"'/></td><td>"+eage_Err_Msg+"</td></tr>");
			out.println("<tr><td>Employee Email</td><td><input type='text'name='eemail'value='"+eemail+"'/></td><td>"+eemail_Err_Msg+"</td></tr>");
			out.println("<tr><td>Employee Emobile</td><td><input type='text'name='emobile'value='"+emobile+"'/></td><td>"+emobile_Err_Msg+"</td></tr>");
			out.println("<tr><td><input type='submit' value='Registration'/></td></tr>");

			out.println("</table></form></body></html>");
			}
		else
			chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
