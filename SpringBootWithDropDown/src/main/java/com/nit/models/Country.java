package com.nit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Country_Master")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Country {

	@Id
	@Column(name="country_Id")
	private Integer countryId;
	@Column(name="country_Code",length = 4)
	private String countryCode;
	@Column(name="country_Name",length = 30)
	private String countryName;

}
