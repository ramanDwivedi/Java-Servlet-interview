package com.servletapp24.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {
	HttpServletRequest request;
	public MyRequest(HttpServletRequest request)
	{
		super(request);
		this.request=request;
	}
	public String getParameter(String name)
	{
		String value=request.getParameter(name);
		if(name.equals("semail"));
		{
			if(!value.endsWith("dss@.com"))
			{
				value=value +"dss@.com";
				}
		}
		return value;
		
	}
	

}
