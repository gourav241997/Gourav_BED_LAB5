package com.greatlearning.employeemgmt.service;

import java.util.List;

import com.greatlearning.employeemgmt.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	void createEmployee(Employee emp);
	void editEmployee(Employee emp);
	int deleteById(int id);
	Employee findById(int id);
}
