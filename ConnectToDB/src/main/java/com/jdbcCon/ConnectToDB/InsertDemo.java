package com.jdbcCon.ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo
{
	public static void main( String[] args )
	{
		try { 		
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("driver is loaded successfully"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sujit","root","");
			System.out.println("connection established");
			PreparedStatement p=con.prepareStatement("insert into sample values(?,?,?)");
			p.setInt(1, 404);
			p.setString(2, "Krish");
			p.setFloat(3, 34000.32f);
			p.executeUpdate();
			p.close();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}