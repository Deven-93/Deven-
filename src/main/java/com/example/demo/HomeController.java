package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;

@Controller
public class HomeController {
	
	@Autowired
	MyRepository repo;
	
	@RequestMapping("/home")
	public String getHome()
	{
		return"index";
	}
	
	@RequestMapping("/addEmp")
		public String addEmployee(@ModelAttribute Employee emp)
	{
		repo.save(emp);
		return "result";
	}


}
