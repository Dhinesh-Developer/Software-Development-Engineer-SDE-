package com.arise.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.arise.Model.Employee;
import com.arise.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static final String URL = "jdbc:mysql://localhost:3306/employees";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String JDBC_URL = "com.mysql.cj.jdbc.Driver";
	
	
	private static final String GET_ALL = "select * from employee";
	private static final String INSERT = "insert into employee(first_name,last_name,username,password,address,contact) values (?,?,?,?,?,?)";
	private static final String GET_BY_ID = "select * from employee where id=?";
	private static final String DELETE_BY_ID = "delete from employee where id = ?";
	private static final String UPDATE_BY_ID = "update employee SET username=?, password = ? where id=? ";
	
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> li = new ArrayList<>();
		try {
			Class.forName(JDBC_URL);
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(GET_ALL);
			while(res.next()) {
				Employee emp = new Employee(res.getInt(1),res.getString("first_name"),res.getString("last_name"),res.getString("username"),res.getString("password"),res.getString("address"),res.getString("contact"));
				li.add(emp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return li;
	}

	@Override
	public int createEmployee(Employee emp) {
		int x = -1;
		try {
			Class<?> forName = Class.forName(JDBC_URL);
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, emp.getFirst_name());
			pstmt.setString(2, emp.getLast_name());
			pstmt.setString(3, emp.getUsername());
			pstmt.setString(4, emp.getPassword());
			pstmt.setString(5, emp.getAddress());
			pstmt.setString(6, emp.getContact());
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return x;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		try {
			Class<?> forName = Class.forName(JDBC_URL);
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pstmt = con.prepareStatement(GET_BY_ID);
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				emp = new Employee(res.getInt("id"),res.getString("first_name"),res.getString("last_name"),res.getString("username"),res.getString("password"),res.getString("address"),res.getString("contact"));
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		return emp;
	}

	@Override
	public int deleteEmployee(int id) {
		int x = -1;
		try {
			Class<?> forName = Class.forName(JDBC_URL);
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pstmt = con.prepareStatement(DELETE_BY_ID);
			pstmt.setInt(1, id);
			 x = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int updateEmployee(int id, String username, String password) {
		int x = -1;
		try {
			Class<?> forName = Class.forName(JDBC_URL);
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pstmt = con.prepareStatement(UPDATE_BY_ID);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setInt(3, id);
			 x = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
	
}
