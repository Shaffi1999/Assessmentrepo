package com.ltimindtree.employeeservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer employeeId;
//@NotNull(message = "Employee Name Can Not Be Null")
private String employeeName;
//@NotNull(message = "Employee Salary Can Not Be Null")
private Long employeeSalary;
//@NotNull(message = "Employee Email Can Not Be Null")
private String employeeEmail;
//@NotNull(message = "Employee Contact Can Not Be Null")
private String employeeContactNo;

}
