package com.uidai.user.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishContoller {

	@RequestMapping(value = "/wish")
	public String wishUser(Model model) {
		String msgTxt="Hello All Of You Today Date is::"+new Date();
		model.addAttribute("msg", msgTxt);
		return "welcome";
	}
	
	@RequestMapping(value = "/greet")
	public String greetUser(@RequestParam("name") String name ,Model model) {
		String msgTxt=name+"Message Comes With User Data:: Success";
		model.addAttribute("msg", msgTxt);
		return "greetUser";
	}
	
}
