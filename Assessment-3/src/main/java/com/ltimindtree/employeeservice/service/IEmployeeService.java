package com.ltimindtree.employeeservice.service;

import java.util.List;

import com.ltimindtree.employeeservice.entity.Employee;

public interface IEmployeeService {
public Employee addEmployee(Employee employee);
public Employee getEmployee(int id);
public List<Employee> getAllEmployees();
}
