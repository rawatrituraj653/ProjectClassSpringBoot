package com.nit;

import java.util.LinkedList;

import com.nit.test.Test;

public class AppDemo {

	public static void main(String[] args) {
		
		LinkedList<Test>test=new LinkedList<>();
		for(int i=0;i<200;i++) {
			test.add(new Test());
		}
	System.out.println("Done Object Stored in database");	
	System.out.println(test);	
	}
}
