package com.nit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {

	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<?> getEmpById(@PathVariable("id") Integer id){
		ResponseEntity<?> res;
		Employee emp = service.getEmpById(id);
		if(emp!=null) {
			res=new ResponseEntity<Employee>(emp,HttpStatus.OK);
		}else {
			res=new ResponseEntity<String>("Employee Not Found..!!",HttpStatus.BAD_REQUEST);
		}
		
		return res;
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> emps = service.getAllEmp();
		ResponseEntity<List<Employee>> entity = new ResponseEntity<>(emps, HttpStatus.OK);
		return entity;
	}
	@PostMapping("/saveEmp")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee){
			Integer saveEmp = service.saveEmp(employee);
			ResponseEntity<String> entity = new ResponseEntity<>("Employee Data Saved With Id:: "+saveEmp,HttpStatus.OK);
		return entity;
	}
	
	@PostMapping("/updateEmp")
	public ResponseEntity<?> updateEmp(@RequestBody Employee employee){
		
		return null;
	}
	
	@GetMapping("/deleteEmp/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") Integer id){
		service.deleteEmp(id);
		ResponseEntity<String>entity=new ResponseEntity<String>("Employee Objects Deleted..!!",HttpStatus.OK);
		return entity;
	}

}
