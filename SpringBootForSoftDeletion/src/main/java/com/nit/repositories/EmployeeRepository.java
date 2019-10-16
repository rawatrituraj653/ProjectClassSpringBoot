package com.nit.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;
@Repository
public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.status=0 where e.empId=:id")
	public Integer softDelete(Integer id);
	
	
	public List<Employee> findByStatus(Integer status);
	
	@Query("select e from Employee e where e.empId=:id and e.status<>0")
	public Optional<Employee> getOneEmp(int id);
	
	
}

