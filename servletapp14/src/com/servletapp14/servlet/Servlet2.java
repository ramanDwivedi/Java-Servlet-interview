package com.servletapp14.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Servlet2 extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


float esal=Float.parseFloat(request.getParameter("esal"));
String eaddr=request.getParameter("eaddr");
HttpSession hs=request.getSession();
hs.setAttribute("esal",esal);
hs.setAttribute("eaddr",eaddr);
RequestDispatcher rd = request.getRequestDispatcher("/form3.html");
rd.forward(request,response);




}

}
