package com.nit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.models.Country;

public interface CountryRepository extends JpaRepository<Country,Integer>{

}
