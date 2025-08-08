package com.arise.dao;

import java.util.List;

import com.arise.Model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployee();
	int createEmployee(Employee emp);
	Employee getEmployeeById(int id);
	int deleteEmployee(int id);
	int updateEmployee(int id,String username,String password);
}
