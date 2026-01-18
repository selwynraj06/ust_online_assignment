package com.assignment9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment9.service.FactorialService;

@RestController
public class FactorialController {
	
	@Autowired
	private FactorialService factorialOfnumber;
	
	// http://localhost:8080/factorial/5
	@GetMapping("/factorial/{num}")
	public int findFactorialOfNumber(@PathVariable int num) {
		return factorialOfnumber.findFactoiral(num);
	}
}
