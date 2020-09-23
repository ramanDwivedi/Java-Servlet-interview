package com.servletapp32.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/test1")
public class DemoFilter implements Filter {
    public DemoFilter() {
    }
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
PrintWriter out=response.getWriter();
out.println("<h1>This line added by Demofilter before processing the request</h1>");

		chain.doFilter(request, response);
		out.println("<h1>This line added by DemoFilter after processing the request</h1>");
		
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
