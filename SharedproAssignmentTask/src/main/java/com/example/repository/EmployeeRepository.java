package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
