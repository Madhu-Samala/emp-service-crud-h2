package com.qa.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.employee.entity.Employee;
import com.qa.employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);	
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
