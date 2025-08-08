package com.arise.Launcher;

import java.util.List;
import java.util.Scanner;

import com.arise.Model.Employee;
import com.arise.dao.EmployeeDao;
import com.arise.daoImpl.EmployeeDaoImpl;

public class EmployeeLauncher {

	public static void main(String[] args) {
		
		Employee _emp = new Employee();
		EmployeeDao _edao = new EmployeeDaoImpl();
		List<Employee> res = _edao.getAllEmployee();
		res.forEach(n-> System.out.println(n));
		
		Employee emp = _edao.getEmployeeById(1);
		System.out.println(emp);
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the first name");
//		String first_name = in.nextLine();
//		System.out.println("Enter the last name");
//		String last_name = in.nextLine();
//		System.out.println("Enter the username");
//		String username = in.nextLine();
//		System.out.println("Enter the password");
//		String password = in.nextLine();
//		System.out.println("Enter the address");
//		String address = in.nextLine();
//		System.out.println("Enter the contact");
//		String contact = in.nextLine();
//		
//		Employee emp = new Employee(first_name,last_name,username,password,address,contact);
//		EmployeeDao _edao = new EmployeeDaoImpl();
//		int x = _edao.createEmployee(emp);
//		
//		if(x > 0) {
//			System.out.println("created");
//		}else {
//			System.out.println("Failed to create");
//		}
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the username");
//		String username = in.nextLine();
//		System.out.println("Enter the password");
//		String password = in.nextLine();
//		System.out.println("Enter the ID");
//		int id = in.nextInt();
//		
//		int x = _edao.updateEmployee(id, username, password);
//		System.out.println(x > 0?"Updated successfully...": "Failed to update");
//	
		
		
	}

}
