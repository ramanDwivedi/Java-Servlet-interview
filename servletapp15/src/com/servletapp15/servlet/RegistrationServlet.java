package com.servletapp15.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
		String man_date=request.getParameter("man_date");
	String exp_date=request.getParameter("exp_date");
	Cookie[]c=request.getCookies();
	String pid=c[0].getValue();
	String pname=c[1].getValue();
	int pcost=Integer.parseInt(c[2].getValue());
	int pquantity=Integer.parseInt(c[3].getValue());
	ProductBean pb=new ProductBean();
	String status=pb.register(pid, pname, pcost, pquantity, man_date, exp_date);
	out.println("<html>");
	out.println("<body bgcolor='pink'>");
	out.println("<center><br><br>");
	out.println("<u>Product Registration Details</u><br><br>");
	out.println("Product Id...."+pid+"<br><br>");
	out.println("Product Name...."+pname+"<br><br>");
	out.println("Product Cost...."+pcost+"<br><br>");
	out.println("Product Quantity...."+pquantity+"<br><br>");
	out.println("Product Manufactured Date...."+man_date+"<br><br>");
	out.println("Product Expiry Date...."+exp_date+"<br><br>");
	out.println("Status.."+status);
	out.println("</center></body></html>");
	}

}
