package com.nit.services;


public interface IAjaxService {
	
	String getAllCountryList();
	
	String getStateList(Integer countryId);
	
	String getCityList(Integer stateId);
}
