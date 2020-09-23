package com.servletapp22.servlet;

import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;

public class MyResponseWrapper extends ServletResponseWrapper {
	ServletResponse response;
	public MyResponseWrapper(ServletResponse response)
	{
		super(response);
		this.response=response;
	}
	public void setContentType(String type)
	{
		if(!type.equals("text/html"))
		{
			response.setContentType("text/html");
		}
	}

}
