package com.arise.Launcher;

import java.util.List;

import com.arise.Model.Employee;
import com.arise.dao.EmployeeDao;
import com.arise.daoImpl.EmployeeImpl;

public class EmployeeLauncher {

	public static void main(String[] args) {
		
		Employee _employee = new Employee();
		EmployeeDao _edao = new EmployeeImpl();
		List<Employee> res = _edao.getAllEmployee();
		
		for(Employee x : res) {
			System.out.println(x);
		}
		
		Employee Emp = _edao.getEmployeeById(1);
		System.out.println(Emp);
		
//		int x = _edao.deleteEmployee(2);
//		if(x > 0) {
//			System.out.println("Deleted successfully");
//		}else {
//			System.out.println("employee Not found");
//		}
		
		for(Employee x : res) {
			System.out.println(x);
		}
	}

}
