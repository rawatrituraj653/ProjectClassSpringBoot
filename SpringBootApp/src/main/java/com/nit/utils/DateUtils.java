package com.nit.utils;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class DateUtils {

	
	public DateUtils() {
		System.out.println("****DateUtils:: Constructor****");
	}
	
	public Date getDate() {
		System.out.println("This is GetDate():: called");
		return new Date();
		
	}
	public LocalDate getDateOnly() {
		System.out.println("getDateOnly:: called");
		return LocalDate.now();
	}
}
