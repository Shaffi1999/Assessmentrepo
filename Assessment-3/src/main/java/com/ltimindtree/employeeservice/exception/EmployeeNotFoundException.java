package com.ltimindtree.employeeservice.exception;

public class EmployeeNotFoundException extends RuntimeException{
public EmployeeNotFoundException(String msg)
{
	super(msg);
}
}
