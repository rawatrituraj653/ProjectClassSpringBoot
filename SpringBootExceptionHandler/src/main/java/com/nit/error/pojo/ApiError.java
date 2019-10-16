package com.nit.error.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ApiError {

	@JsonProperty("error-code")
	private Integer  errorCode;
	
	@JsonProperty("error-message")
	private String errorMsg;
	
	private  Integer status; 
}

