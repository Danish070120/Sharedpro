package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void updateEmployee(Employee employee, int employeeId);

	void deleteEmployee(int employeeId);
	

}
