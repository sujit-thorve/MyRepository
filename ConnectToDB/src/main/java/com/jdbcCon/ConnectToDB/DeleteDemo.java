package com.jdbcCon.ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 		
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("driver is loaded successfully"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sujit","root","");
			System.out.println("connection established");
			PreparedStatement p=con.prepareStatement("delete from sample where id=?");
			p.setInt(1, 3);
			p.executeUpdate();
			p.close();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
