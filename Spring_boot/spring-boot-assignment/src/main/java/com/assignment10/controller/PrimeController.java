package com.assignment10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment10.service.PrimeService;

@RestController
public class PrimeController {
	
	@Autowired
	private PrimeService checkPrimeOrNot;
	
	// http://localhost:8080/prime/5
	@GetMapping("/prime/{num}")
	public String  checkPrimeNumber(@PathVariable int num) {
		return checkPrimeOrNot.checkPrime(num);
	}
}
