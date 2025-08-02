package com.arise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.arise.Entity.Login;

public class LoginDao {
	
	public boolean validate(Login login) throws ClassNotFoundException{
		boolean status = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employees?useSSL=true&requireSSL=true&verifyServerCertificate=false";

		
		try(Connection con = DriverManager.getConnection(url,"root","root");
				PreparedStatement pstmt = con.prepareStatement("select * from login where username = ? and password = ?")){
			
			pstmt.setString(1, login.getUsername());
			pstmt.setString(2, login.getPassword());
			System.out.println(pstmt);
			ResultSet res = pstmt.executeQuery();
			status = res.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
