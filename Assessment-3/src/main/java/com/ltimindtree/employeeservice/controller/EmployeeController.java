package com.ltimindtree.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.employeeservice.entity.Employee;
import com.ltimindtree.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService service;
@PostMapping("/employees")
public Employee addEmployee(@RequestBody Employee employee)
{
	return service.addEmployee(employee);
}

@GetMapping("/employees")
public List<Employee> getAllEmployees()
{
	return service.getAllEmployees();
}

@GetMapping("/employees/{id}")
public Employee getEmployeeById(@PathVariable("id") int id)
{
	return service.getEmployee(id);
}
}
