package com.servletapp08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentService {
	StodentTo sto;
	String status = "";
	PreparedStatement pst;
	Connection con;
	ResultSet rs;

  public StudentService()
	{
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");

		  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }

	}
  public StodentTo getStudent(String sid) {
	  try {
		  pst = con.prepareStatement("select * from student where sid = ?");
		  pst.setString(1, sid);
		  rs = pst.executeQuery();
		  boolean b = rs.next();
		  if(b == true) {
			  sto = new StodentTo();
			  sto.setSid(rs.getString("SID"));
			  sto.setSname(rs.getString("SNAME"));
			  sto.setSaddr(rs.getString("SADDR"));
		  }
		  else
			  sto=null;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return sto;
  
}
  public String update(String sid, String sname, String saddr) {
	  try {
		  pst = con.prepareStatement("update student set sname = ?, saddr = ? where sid = ?");
		  pst.setString(1, sname);
		  pst.setString(2, saddr);
		  pst.setString(3, sid);
		  pst.executeUpdate();
		  status = "success";
	  } catch (Exception e) {
		  status = "failure";
		  e.printStackTrace();
}
	  return status;

  }


}
