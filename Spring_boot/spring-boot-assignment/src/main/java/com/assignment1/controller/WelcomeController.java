package com.assignment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService service;
	
//	public WelcomeController(WelcomeService service) {
//		this.service = service;
//	}
	// http://localhost:8080/welcome
	@GetMapping("/welcome")
	public String welcome() {
		return service.welcomeMessage();
	}
}
