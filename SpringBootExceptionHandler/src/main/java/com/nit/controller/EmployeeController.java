package com.nit.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/getUser")
	public String getdata(Model model) {
		String ss=null;
		ss.length();
		model.addAttribute("msg", "Today Date is :: "+LocalDateTime.now());
		return "displayPage";
	}

	
}
