package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudent(Student st) {
		boolean f=false;
		try {

			Connection con = Cg.createCon();
			String q = "insert into Student(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentPhone());
			pst.setString(3, st.getStudentCity());
			pst.executeUpdate();
			
			f=true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deleteStudent(int id) {
		boolean f=false;
		try {

			Connection con = Cg.createCon();
			String q = "delete from Student where sid=?";
			PreparedStatement pst = con.prepareStatement(q);
			pst.setInt(1,id);
			
			pst.executeUpdate();
			
			f=true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showALL() {
		// TODO Auto-generated method stub
		
		try {

			Connection con = Cg.createCon();
			String q = "select * from Student";
			Statement stt = con.createStatement();
			ResultSet set = stt.executeQuery(q);
		    while(set.next())
		    {
		    	int id = set.getInt(1);
		        String name = set.getString(2);
		    	String phone = set.getString(3);
		    	String city = set.getString(4);
		    	System.out.println("id: "+ id);
		    	System.out.println("name: "+ name);
		    	System.out.println("phone: "+ phone);
		    	System.out.println("city: "+ city);
		    	System.out.println("------------------- ");
		    	
		    	
		    }

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
		
}
