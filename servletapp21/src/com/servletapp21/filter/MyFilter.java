package com.servletapp21.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.servletapp21.servlet.MyRequest;
public class MyFilter implements Filter {
 public MyFilter() {
    }
public void destroy() {
	}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
MyRequest mr=new MyRequest(request);

		chain.doFilter(mr, response);
	}
public void init(FilterConfig fConfig) throws ServletException {
	}

}
