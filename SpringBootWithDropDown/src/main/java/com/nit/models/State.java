package com.nit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="State_Master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
	@Id
	@Column(name="State_Id")
	private Integer stateId;
	@Column(name="State_Name",length = 30)
	private String stateName;
	@Column(name="Country_Id")
	private Integer country_Id;
}
