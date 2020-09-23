package com.servletapp16.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String depName=request.getParameter("depName");
	float depAmount=Float.parseFloat(request.getParameter("depAmount"));
	HttpSession hs=request.getSession();
	String accNo=(String)hs.getAttribute("accNo");
	String accName= (String)hs.getAttribute("accName");
	String accType=(String)hs.getAttribute("accType");
	String accBranch=(String)hs.getAttribute("accBranch");
	out.println("<html><body bgcolor='lightblue'><br><br>");
	out.println("<center><table>");
	out.println("<tr><td colspan='2'><b><font size='6' color='red'>");
	out.println("<u>Transaction Details</u><font></b></td></tr>");
	out.println("<tr><td>Transaction Id</td><td>:t1</td></tr>");
	out.println("<tr><td>Transaction Name</td><td>:Deposite</td></tr>");
	out.println("<tr><td>Account Number</td><td>:"+accNo+"</td></tr>");
	out.println("<tr><td>Account Name</td><td>:"+accName+"</td></tr>");
	out.println("<tr><td>Account Type</td><td>:"+accType+"</td></tr>");
	out.println("<tr><td>Account Branch</td><td>:"+accBranch+"</td></tr>");
	out.println("<tr><td>Depositor Name</td><td>:"+depName+"</td></tr>");
	out.println("<tr><td>Deposit Amount</td><td>:"+depAmount+"</td></tr>");
    out.println("</center></form></body></html>");

	
	
	
	
	
	}

}
