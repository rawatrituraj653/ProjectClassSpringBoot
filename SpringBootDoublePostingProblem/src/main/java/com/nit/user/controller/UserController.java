package com.nit.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.user.constants.AppConstants;
import com.nit.user.model.User;

@Controller
public class UserController {
	
	private static final Logger log=LoggerFactory.getLogger(UserController.class);

	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String loadForm(Model model) {
		log.info("Get  Method Called");
		model.addAttribute(AppConstants.MODEL_ATTR, new User());
		loadAllCountry(model);
		return AppConstants.LOGICAL_VIEW;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public  String submitForm(@ModelAttribute User user,RedirectAttributes redirect) {
			log.info("Form Submited Suucessfully...!! "+user);
			redirect.addFlashAttribute(AppConstants.MSG_KEY, AppConstants.SUCC_MSG);
		return AppConstants.REDIRECT_VIEW;
	}
	
	@RequestMapping(value="/formRedirect")
	public String redirectFrom(Model model) {
		log.info("Redirection For Avioding  Double Posting..!!");
		model.addAttribute(AppConstants.MODEL_ATTR, new User());
		loadAllCountry(model);
		return AppConstants.LOGICAL_VIEW;
	}
	
	private void loadAllCountry(Model model) {
		List<String> list=new ArrayList<>();
		list.add("India");
		list.add("USA");
		list.add("UK");
		list.add("Spain");
		list.add("Canada");
		list.add("Denmark");
		model.addAttribute("countryList",list);
	}
}

