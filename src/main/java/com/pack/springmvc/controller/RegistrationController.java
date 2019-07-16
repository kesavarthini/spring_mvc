package com.pack.springmvc.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.springmvc.service.EmployeeService;
import com.pack.springmvc.model.Employee;

@Controller
@RequestMapping("employee")
public class RegistrationController {

	@GetMapping("/displayall")
	public String displayAll(ModelMap map) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");

		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		map.addAttribute("emplist", employeeService.listAllEmployee());
		
//		for (Employee emp : emplist) {
//			System.out.println(emp);
//		}
		return "display";
	}

	@GetMapping("/getbyid")
	public void getById() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		Employee employee = employeeService.findByIdEmployee(103);
		System.out.println(employee);
	}

}
