package com.uidai.user.pojo;

import lombok.Data;
/**
 * this class is used to sending and recieving the data 
 * from controller to UI
 * 
 * @author Rituraj
 *
 */
@Data
public class User {
	
	private Integer userId;
	private String username;
	private String pazzword; 
	private String email;
	private Long phno;
	private String country;
	
	
}
