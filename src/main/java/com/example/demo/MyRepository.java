package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

public interface MyRepository extends JpaRepository<Employee,Integer>{
	
	

}
