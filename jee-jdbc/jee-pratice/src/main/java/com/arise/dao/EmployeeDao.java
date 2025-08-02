package com.arise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.arise.Entity.Employee;

public class EmployeeDao {

    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String INSERT = "INSERT INTO employee(first_name, last_name, username, password, address, contact) VALUES (?, ?, ?, ?, ?, ?)";
        int res = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
             PreparedStatement pstmt = con.prepareStatement(INSERT)) {
            
            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getUsername());
            pstmt.setString(4, employee.getPassword());
            pstmt.setString(5, employee.getAddress());
            pstmt.setString(6, employee.getContact());
            
            System.out.println(pstmt); // For debugging
            
            res = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
