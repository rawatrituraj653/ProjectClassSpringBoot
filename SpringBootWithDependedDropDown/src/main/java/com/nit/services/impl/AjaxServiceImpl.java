package com.nit.services.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.models.City;
import com.nit.models.Country;
import com.nit.models.State;
import com.nit.repositories.CityRepository;
import com.nit.repositories.CountryRepository;
import com.nit.repositories.StateRepository;
import com.nit.services.IAjaxService;
@Service
public class AjaxServiceImpl implements IAjaxService{

	@Autowired
	private CountryRepository country;
	@Autowired
	private StateRepository state;
	@Autowired
	private CityRepository city;
	
	@Override
	@Transactional(readOnly = true)
	public String getAllCountryList() {
		Map<Integer,String> map=new LinkedHashMap<>();
		String jsonData=null;
		List<Country> countryList = country.findAll();
		System.out.println(countryList);
		countryList.forEach(p->{
			map.put(p.getCountryId(), p.getCountryName());
		});
		 jsonData = jsonConerter(map);
		System.out.println(jsonData);
		return jsonData;
	}

	@Override
	@Transactional(readOnly = false)
	public String getStateList(Integer countryId) {
		String jsonData=null;
		Map<Integer,String> map=new LinkedHashMap<>();
		List<State> stateList = state.findByCountryId(countryId);
		stateList.forEach(li->{
			map.put(li.getStateId(), li.getStateName());
		});
		
		System.out.println(map);
		jsonData = jsonConerter(map);
		System.out.println(jsonData);

		return jsonData;
	}

	@Override
	public String getCityList(Integer stateId) {
		Map<Integer, String> map=new LinkedHashMap<>();
		List<City> stateList = city.findByStateId(stateId);
		stateList.forEach(li->{
			map.put(li.getCityId(), li.getCityName());
		});
		System.out.println(map);
		String jsonData = jsonConerter(map);
		System.out.println(jsonData);
		return jsonData;
	}
		
	
	private String jsonConerter(Map<Integer,String> map) {
		String jsonData=null;
		ObjectMapper mapper=new ObjectMapper();
		try {
			 jsonData = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonData;
	}
	
	
}
