package com.nit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.models.State;

public interface StateRepository extends JpaRepository<State, Integer>{

	List<State> findByCountryId(Integer countryId);
}
