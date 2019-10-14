package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.utils.DateUtils;


@Component
public class UserService {
	
	
	private DateUtils util;
	@Autowired
	public UserService(DateUtils util) {
		this.util=util;
		System.out.println("****UserService :: constructor****");
	}
	
	
	public void getDetails() {
		System.out.println(util.getDate());
		System.out.println(util.getDateOnly());
		
	}
	
	
}
