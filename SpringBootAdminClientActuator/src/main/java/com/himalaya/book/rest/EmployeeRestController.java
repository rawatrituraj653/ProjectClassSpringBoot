package com.himalaya.book.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@GetMapping("/getMsg")
	public String getEmp() {
		
		return "Employee Object Saved";
	}
}
