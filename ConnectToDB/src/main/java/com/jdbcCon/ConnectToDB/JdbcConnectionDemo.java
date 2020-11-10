package com.jdbcCon.ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectionDemo {
	public static void main(String args[]) {
		try { 		
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("driver is loaded successfully"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sujit","root","");
			System.out.println("connection established");
			Statement st=con.createStatement();
			ResultSet s= st.executeQuery("select * from sample");
			while(s.next()) {
			   System.out.println("\n "+s.getInt(1)+"\t"+s.getString(2)+"\t"+s.getFloat(3));	
			}
			s.close();
			con.close();
		}
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
