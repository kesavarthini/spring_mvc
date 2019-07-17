package com.pack.springmvc.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.springmvc.service.EmployeeService;
import com.pack.springmvc.model.Employee;

@Controller
@RequestMapping("employee")
public class RegistrationController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/displayall")
	public String displayAll(Model model) {
		model.addAttribute("emplist", employeeService.listAllEmployee());
		return "displayall";
	}

	@GetMapping("/getbyid/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		Employee employee = employeeService.findByIdEmployee(id);
		model.addAttribute("employee", employee);
		return "display";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("employee",new Employee());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) {
		System.out.println(employee);
		 String returnVal = "success";
	        if(result.hasErrors()) {
	        
	            returnVal = "register";
	        }
	    	employeeService.insertEmployee(employee);
	        return returnVal;
	}


	
	
}

