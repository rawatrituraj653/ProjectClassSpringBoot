package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService {

		public Employee getEmpById(Integer eid);
		
		public List<Employee> getAllEmp();
		
		public void deleteEmp(Integer eid);
		
		public Integer updateEmp(Employee emp);
		
		public  Integer saveEmp(Employee emp);
		
	
}
