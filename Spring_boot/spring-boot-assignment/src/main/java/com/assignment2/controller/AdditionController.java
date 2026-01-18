package com.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment2.service.AdditionService;

@RestController
public class AdditionController {
	
	@Autowired
	private AdditionService addService;
	
	// http://localhost:8080/add?a=10&b=20
	@GetMapping("/add")
	public int addNumber(@RequestParam int a,@RequestParam int b) {
		return addService.getAddoftwono(a, b);
	}
}
