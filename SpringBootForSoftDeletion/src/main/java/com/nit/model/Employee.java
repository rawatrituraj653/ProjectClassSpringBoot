package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_MASTER")
public class Employee {
	@Id
	@Column(name="emp_id")
	@GeneratedValue
	private Integer empId;
	@Column(name="emp_name",length = 20)
	private String empName;
	@Column(name="emp_gender",length = 10)
	private String empGender;
	private Integer  deptNo;
	@JsonIgnore
	private Integer status; 
}
