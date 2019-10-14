package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.models.City;
import com.nit.models.Country;
import com.nit.models.State;
import com.nit.repositories.CityRepository;
import com.nit.repositories.CountryRepository;
import com.nit.repositories.StateRepository;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	private CountryRepository corepo;
	@Autowired
	private StateRepository srepo;
	@Autowired
	private CityRepository cirepo;
	
	
	@Override
	public void run(String... args) throws Exception {
	/*
		Country country=new Country(1, "+91", "India");
		Country country1=new Country(2, "+1", "US");
		corepo.save(country);
		corepo.save(country1);
		
		System.out.println("******All Country Object  Saved******");
		
		State  state1=new State(1, "Madhaya Pradesh", 1);
		State  state2=new State(2, "Karnataka", 1);
		State  state3=new State(3, "New York", 2);
		State  state4=new State(4, "Washington", 2);
		srepo.save(state1);
		srepo.save(state2);
		srepo.save(state3);
		srepo.save(state4);
		System.out.println("******All State Object  Saved******");
		
		
		City city1=new City(1, "Chhatarpur", 1);
		City city2=new City(2, "Indore", 1);
		City city3=new City(3, "Banglore", 2);
		City city4=new City(4, "Uddipi", 2);
		
		City city5=new City(5, "Albany", 3);
		City city6=new City(6, "Bronx", 3);
		City city7=new City(7, "Seattle", 4);
		City city8=new City(8, "Olympia", 4);
		*/
		City city1=new City(9, "Devas", 1);
		City city2=new City(10, "Ujjain", 1);
		City city3=new City(11, "Mysore", 2);
		City city4=new City(12, "ooty", 2);
		
		City city5=new City(13, "Yonkers", 3);
		City city6=new City(14, "Ithaca", 3);
		City city7=new City(15, "Everett", 4);
		City city8=new City(16, "Spokane", 4);
		
		cirepo.save(city1);
		cirepo.save(city2);
		cirepo.save(city3);
		cirepo.save(city4);
		cirepo.save(city5);
		cirepo.save(city6);
		cirepo.save(city7);
		cirepo.save(city8);
		System.out.println("All City Object Saved");
		
		
	}

}
