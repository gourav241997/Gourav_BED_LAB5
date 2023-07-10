package com.greatlearning.employeemgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.employeemgmt.dao.EmployeeRepository;
import com.greatlearning.employeemgmt.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	@Override
	public void createEmployee(Employee emp)
	{
		repository.save(emp);
	}

	@Override
	public void editEmployee(Employee emp) {
		repository.save(emp);
		
	}

	@Override
	public int deleteById(int id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public Employee findById(int id) {
		Optional <Employee> optemp = repository.findById(id);
		if(optemp.isPresent()) {
		return optemp.get();
	}
		return null;

	}
}
