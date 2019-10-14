package com.nit.models;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="City_Master")
public class City {

	@Id
	@Column(name="City_Id")
	private Integer cityId;
	@Column(name="City_Name",length = 30)
	private String cityName;
	@Column(name="State_Id")
	private Integer stateId;
	
}
