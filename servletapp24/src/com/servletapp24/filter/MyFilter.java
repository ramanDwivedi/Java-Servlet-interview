package com.servletapp24.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletapp24.servlet.MyRequest;
public class MyFilter implements Filter {

public MyFilter() {
    }

public void destroy() {
	}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
HttpServletRequest req=(HttpServletRequest)request;
HttpServletResponse res=(HttpServletResponse)response;
MyRequest mr=new MyRequest(req);
chain.doFilter(mr, response);
	}

public void init(FilterConfig fConfig) throws ServletException {
	}

}
