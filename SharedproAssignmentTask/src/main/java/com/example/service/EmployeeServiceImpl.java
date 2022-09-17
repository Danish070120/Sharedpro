package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.CustomException;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		try {
			log.info("employee {}", employee);
			employeeRepository.save(employee);
			return employee;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new CustomException(500, e.getMessage());
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		try {
			return (List<Employee>) employeeRepository.findAll();

		} catch (Exception e) {

			log.error(e.getMessage());
			throw new CustomException(500, e.getMessage());

		}

	}

	@Override
	public void updateEmployee(Employee employee, int employeeId) {
		try {

		} catch (Exception e) {

			log.error(e.getMessage());
			throw new CustomException(500, e.getMessage());

		}

	}

	@Override
	public void deleteEmployee(int employeeId) {

		try {

		} catch (Exception e) {

			log.error(e.getMessage());
			throw new CustomException(500, e.getMessage());
		}
	}
}