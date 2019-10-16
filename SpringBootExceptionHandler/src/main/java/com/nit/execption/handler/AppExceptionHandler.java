package com.nit.execption.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	
	@ExceptionHandler(value = NullPointerException.class)
	public String getData(Model model ) {
		
		model.addAttribute("msg", "Some Error Occured in this page Try Again after some time");
		return "errorPage";
	}
}

