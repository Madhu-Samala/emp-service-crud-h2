package com.qa.employee.service;

import java.util.List;

import com.qa.employee.entity.Employee;

public interface IEmployeeService {
	//CRUD operations
	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int id);

}
