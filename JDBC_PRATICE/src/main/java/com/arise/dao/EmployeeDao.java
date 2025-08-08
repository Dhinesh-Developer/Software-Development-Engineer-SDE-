package com.arise.dao;

import java.util.List;

import com.arise.Model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	int deleteEmployee(int id);
	
}
