package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;

public interface MyJpaRepo extends JpaRepository<Employee,Integer> {
	
	@Query("from Employee")
	List<Employee> getEmployee();
	
	@Query("from Employee where salary>:salary")
	List<Employee> getSalaryGreater(@Param("salary") double salary);
	
	@Query("from Employee where salary<:salary")
	List<Employee> getSalaryLess(@Param("salary") double salary);

}
