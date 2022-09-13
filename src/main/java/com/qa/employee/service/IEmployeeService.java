package com.qa.employee.service;

import java.util.List;

import com.qa.employee.entity.Employee;
import com.qa.employee.exception.EmployeeAlreadyExistsException;

public interface IEmployeeService {
	//CRUD operations
	public Employee saveEmployee(Employee employee) throws EmployeeAlreadyExistsException;
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int id);

}
