package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	@Autowired
	MyJpaRepo repo;
	
	@RequestMapping("/home")
	public String getHome()
	{
		return"index";
	}
	
	@RequestMapping("/add")
	
	public ModelAndView add(@ModelAttribute("emp") Employee emp)
	{
		ModelAndView mv = new ModelAndView();
		repo.save(emp);
		List<Employee> employees= repo.getEmployee();
		mv.addObject("lists",employees );
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/fetch")
	public String redirect()
	{
		return "result";
	}
	@RequestMapping("get")
	//@ResponseBody
	public String getSalary(@RequestParam("salary") double salary,@RequestParam("category") String category,Model m)
	{
		List<Employee> emp=null; 
		
			 emp= repo.getSalaryGreater(salary);
		
		if(category.equals("less"))
		{ 
			emp= repo.getSalaryLess(salary);
			
		}
		m.addAttribute("lists", emp);
		
		return "result";
	}
	

}
