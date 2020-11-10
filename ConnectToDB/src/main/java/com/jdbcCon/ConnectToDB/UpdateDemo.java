package com.jdbcCon.ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 		
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("driver is loaded successfully"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sujit","root","");
			System.out.println("connection established");
			PreparedStatement p=con.prepareStatement("update sample set name = ? where id=?");
			p.setString(1, "Ram");
			p.setInt(2, 404);
			p.executeUpdate();
			p.close();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
