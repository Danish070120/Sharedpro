package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.entity.Employee;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Employee> employeeNotfoundExceptionHandler(CustomException exception) {
		String message = exception.getMessage();
		Employee employee = new Employee();
		return new ResponseEntity<Employee>(employee, HttpStatus.NOT_FOUND);

	}
}
