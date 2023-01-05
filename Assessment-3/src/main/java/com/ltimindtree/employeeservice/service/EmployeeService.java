package com.ltimindtree.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.employeeservice.entity.Employee;
import com.ltimindtree.employeeservice.exception.EmployeeNotFoundException;
import com.ltimindtree.employeeservice.repository.EmployeeRepository;
@Service
public class EmployeeService implements IEmployeeService{
@Autowired
private EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id).orElseThrow(()->new EmployeeNotFoundException("No Employee Found With Id: "+id));
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
