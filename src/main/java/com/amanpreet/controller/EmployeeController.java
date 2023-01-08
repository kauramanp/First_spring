package com.amanpreet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}

}
