package com.servletapp13.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDao {
	Connection con;
	Statement st;
	ResultSet rs;
	ArrayList<Product> al;
	public ProductDao()
	{
		try
	{
	Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");


      Statement st=con.createStatement();
	  al=new ArrayList<Product>();
	
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void add(String pid,String pname,int pcost)
	{
		try {
			st.executeQuery("insert into product values('"+pid+"','"+pname+"',"+pcost+")");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	
	}
	public ArrayList<Product> getProducts()
	{
		try {
			rs=st.executeQuery("select * from Product");
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getString(1));
				p.setPname(rs.getString(2));
				p.setPcost(rs.getInt(3));
				al.add(p);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	return al;
	}
}
