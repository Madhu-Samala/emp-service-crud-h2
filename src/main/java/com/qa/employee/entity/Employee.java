package com.qa.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "emp_details")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_email")
	private String email;
	@Column(name = "emp_contactno")
	private String contactno;
	@Column(name = "emp_salary")
	private double salary;
	
	
	

}