package com.servletapp15.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductBean {
	Connection con;
	Statement st;
	ResultSet rs;
	String status="";
	public ProductBean()
	{
	try
		{Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			st=con.createStatement();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String register(String pid,String pname,int pcost,int pquantity,String man_date,String exp_date)
	{
		try {
			rs=st.executeQuery("select * from product where pid='"+pid+"'");
			boolean b=rs.next();
			if(b==true) 
			status="Product Existed Already";
			else
			{
				int rowcount=st.executeUpdate("insert into product values('"+pid+"','"+pname+"',"+pcost+","+pquantity+",'"+man_date+"','"+exp_date+"')");
			if(rowcount==1)
				status="SUCCESS";
			else
				status="FAILURE";
			}
		}
		catch(Exception e)
		{
			status="FAILURE";
			e.printStackTrace();
		}
		return status;
	}
	

}
