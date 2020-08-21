package com.student.manage;
import java.sql.*;

public class Cg {
	static Connection con;

	public static Connection createCon ()
          {
       
           try {
        	   Class.forName("com.mysql.jdbc.Driver");
        	   String user = "root";
        	   String password = "Gks@sql";
        	   String url = "jdbc:mysql://localhost:3306/student_manage";
        	   
        	  con = DriverManager.getConnection(url , user,password );
        	  
          
          }
          catch(Exception e) 
           { e.printStackTrace();}
           return con;   
          }
	
}
