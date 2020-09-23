package com.servletapp15.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int pcost=Integer.parseInt(request.getParameter("pcost"));
int pqual=Integer.parseInt(request.getParameter("pqual"));
Cookie c1=new Cookie("pcost",""+pcost);
Cookie c2=new Cookie("pqual",""+pqual);
response.addCookie(c1);
response.addCookie(c2);
RequestDispatcher rd=request.getRequestDispatcher("/form3.html");
rd.forward(request,response);


}

}
