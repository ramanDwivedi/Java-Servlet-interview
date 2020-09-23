package com.servletapp18.filter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class ValidationFilter implements Filter {

    public ValidationFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String uage = request.getParameter("uage");
		String uemail = request.getParameter("uemail");
		String umobile = request.getParameter("umobile");
		String uname_Error_Message = "";
		String upwd_Error_Message = "";
		String uage_Error_Message = "";
		String uemail_Error_Message = "";
		String umobile_Error_Message = "";
		boolean flag = true;
		if(uname == null || uname.equals("")) {
			uname_Error_Message = "User Name Is Required";
			flag = false;
		}
		if(upwd == null || upwd.equals("")) {
			upwd_Error_Message = "User Password Is Required";
			flag = false;
		}else {
			int length = upwd.length();
			if(length < 6) {
				upwd_Error_Message = "User Password Must Be Minimum 6 Characters.";
				flag = false;}
			if(length > 10) {
				upwd_Error_Message = "User Password Must Be Maximum 10 Characters.";
				flag = false;
			}
		}
		if(uage == null || uage.equals("")) {
			uage_Error_Message = "User Age Is Required";
			flag = false;
		}else {
			int age = Integer.parseInt(uage);
			if(age < 18 || age > 30) {
				uage_Error_Message = "User Age Must Be In The Range from 18 to 30 Years.";
				flag = false;
			}
		}

		if(uemail == null || uemail.equals("")) {
			uemail_Error_Message = "User Email Is Required";
			flag = false;
		}else {
			if(!uemail.contains("@")) {
				uemail_Error_Message = "User Email Is Invalid";
				flag = false;
			}
		}

		if(umobile == null || umobile.equals("")) {
			umobile_Error_Message = "User Mobile Is Required";
			flag = false;
		}else {
			if(!umobile.startsWith("91-")) {
				umobile_Error_Message = "User Mobile Is Invalid";
				flag = false;
			}
		}
		if(flag == true) 
chain.doFilter(request, response);
	else {
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Durga Software Solutions</h2>");
		out.println("<h3>User Registration Details</h3>");
		out.println("<form method='post' action='./reg'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>User Name</td>");
		out.println("<td><input type='text' name='uname' value='"+uname+"'/></td>");
		out.println("<td><font color='red' size='5'>"+uname_Error_Message+"</font></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>User Password</td>");
		out.println("<td><input type='password' name='upwd' value='"+upwd+"'/></td>");
		out.println("<td><font color='red' size='5'>"+upwd_Error_Message+"</font></td>");
		out.println("</tr>");
        out.println("<tr>");
        out.println("<td>User Age</td>");
        out.println("<td><input type='text' name='uage' value='"+uage+"'/></td>");
        out.println("<td><font color='red' size='5'>"+uage_Error_Message+"</font></td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>User Email</td>");
        out.println("<td><input type='text' name='uemail' value='"+uemail+"'/></td>");
        out.println("<td><font color='red' size='5'>"+uemail_Error_Message+"</font></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>User Mobile</td>");
        out.println("<td><input type='text' name='umobile' value='"+umobile+"'/></td>");
        out.println("<td><font color='red' size='5'>"+umobile_Error_Message+"</font></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td><input type='submit' value='Registration'/></td>");
        out.println("</tr>");

        out.println("</table></form></body></html>");
}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
