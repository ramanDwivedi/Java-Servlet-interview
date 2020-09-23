package com.servletapp26.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class ServletApp26 extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.println("<h1>Client Ip Address:"+request.getRemoteAddr()+"</h1>");
out.println("<h1>Client Host:"+request.getRemoteHost()+"</h1>");
out.println("<h1>Client Port:"+request.getRemotePort()+"</h1>");
out.println("<h1>Server Name:"+request.getServerName()+"</h1>");
out.println("<h1>Server Port:"+request.getServerPort()+"</h1>");




}

}
