package com.arise.Launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class addImage {
	
	static final String PATH = "C:\\Arise_Projects\\DIV - Full stack\\Files\\emp2.jpg";
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			PreparedStatement pstmt = con.prepareStatement("UPDATE employee SET image_data =? WHERE id=?");
			FileInputStream fis = new FileInputStream(PATH);
			System.out.println("Enter the ID:");
			int id = in.nextInt();
			pstmt.setInt(2,id);
			
			pstmt.setBinaryStream(1, fis);
			
			int i = pstmt.executeUpdate();
			System.out.println("Images updated "+i);
		
		
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
