package com.servletapp30.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.println("<h1>Hello this is first servlet</h1>");
RequestDispatcher rd=request.getRequestDispatcher("/test2");
rd.include(request,response);
out.println("<h1>Hi this is first servlet</h1>");
}

}
