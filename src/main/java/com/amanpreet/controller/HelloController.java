package com.amanpreet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amanpreet.pojo.EmployeePojo;

@Controller
public class HelloController {
	//Model, model map and ModelAndView to define a model in spring boot
	//Model -> used to add attributes to to the model
	//ModelMap -> defines a holder for model attributes and is primarily designed for adding attributes
	//ModelAndView -> holder for model and a view
	@RequestMapping("/")
	public String welcome(ModelMap model) {
		model.addAttribute("message","This is model map message");
		return "welcome";
	}

	
	@RequestMapping("/hello")
	public String giveHelloMessage(Model model) {
		model.addAttribute("employeeModel",new EmployeePojo() );
		return "hello";
	}

	
	@RequestMapping("/goodbye")
	public String goodbye() {
		return "goodbye";
	}
	
	//THe @ModelAttribute refers to the property of model object and is used to prepare model data.
	//this annotation binds the model object to n named model attribute
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeModel") EmployeePojo employee) {
		return "registration-confirmation";
		
		
	}

}
