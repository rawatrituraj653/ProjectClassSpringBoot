package com.nit.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.services.IAjaxService;

@Controller
public class AjaxController {

	@Autowired
	private IAjaxService service;
	
	@RequestMapping("/getForm")
	public String getDropDownPage(Model model) {
		String txtMsg="This is SpringBoot With Jquery And Ajax:: "+LocalDateTime.now();
		model.addAttribute("msg", txtMsg);
		return "dropdown";
	}
	
	@RequestMapping("/getCountry")
	public @ResponseBody String getCountryList() {
		String  countriesList=service.getAllCountryList();
		return countriesList;
	}
	
	@RequestMapping("/getState")
	public @ResponseBody String getStateList(@RequestParam("countryId") Integer countryId) {
		String stateList = service.getStateList(countryId);
		return stateList; 
	}
	@RequestMapping("/getCity")
	public @ResponseBody String getCityList(@RequestParam("stateId") Integer stateId) {
		String cityList = service.getCityList(stateId);
		return cityList;
	}
}
