package com.himalaya.book.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpRestController {

	@GetMapping("/msg")
	public String getData() {
		
		return "This is Actuator related Program "
		+LocalDateTime.of(LocalDate.of(2019, 11, 16), LocalTime.of(22, 20));
	}
	
}
