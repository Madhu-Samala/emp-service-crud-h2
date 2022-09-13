package com.qa.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.employee.entity.Employee;
import com.qa.employee.service.EmployeeService;

@RestController
@RequestMapping("api/v1/employee-service")
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	/*
	 * It is the responsible for sending the response to the client converting java
	 * objects to json by default along with the status code
	 * 
	 * 
	 */
	ResponseEntity<?> responseEntity;

	@PostMapping("/employee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		Employee createdEmployee = this.empService.saveEmployee(employee);
		responseEntity = new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
		return responseEntity;
	}

}
