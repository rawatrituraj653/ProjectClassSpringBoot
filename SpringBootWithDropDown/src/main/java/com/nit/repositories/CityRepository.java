package com.nit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.models.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
