package com.servletapp28.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/test")
public class ServletApp28 extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
HttpSession session=request.getSession();
Integer count=(Integer)session.getAttribute("hitcount") ;
if(count==null)
count=1;
else
count++;
session.setAttribute("hitcount",count);
out.println("<h1>The number of request in current session is:"+count+"</h1>");



	


}

}
