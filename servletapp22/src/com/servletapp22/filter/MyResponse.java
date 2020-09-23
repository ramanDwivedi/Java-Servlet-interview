package com.servletapp22.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.servletapp22.servlet.MyResponseWrapper;
public class MyResponse implements Filter {

public MyResponse() {
    }
public void destroy() {
	}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	MyResponseWrapper mrw=new MyResponseWrapper(response);
		chain.doFilter(request, mrw);
	}

public void init(FilterConfig fConfig) throws ServletException {
	}

}
