package com.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Employee;
import com.nit.repositories.EmployeeRepository;
import com.nit.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee getEmpById(Integer eid) {
		Optional<Employee> employee = repo.getOneEmp(eid);
		if(employee.isPresent()) {
			return employee.get();
		}
	return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> employees = repo.findByStatus(1);
		return employees;
	}

	@Override
	public void deleteEmp(Integer eid) {
		Integer empId = repo.softDelete(eid);
		System.out.println("Employee Delete With :: "+empId);
	}

	@Override
	public Integer updateEmp(Employee emp) {
		Employee employee = repo.save(emp);

		return employee.getEmpId();
	}

	@Override
	public Integer saveEmp(Employee emp) {
		emp.setStatus(1);
		Employee save = repo.save(emp);
		return save.getEmpId();
	}

	
}
