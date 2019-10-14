package com.nit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.UserService;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAppApplication.class, args);
		UserService bean = ctx.getBean(UserService.class);
		bean.getDetails();
		
	}

}
