package com.assignment3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment3.service.OddOrEvenService;

@RestController
public class OddOrEvenController {

	@Autowired
	private OddOrEvenService checkOddorEven;
	
	// http://localhost:8080/evenodd/10
	@GetMapping("/evenodd/{num}")
	public String oddOrEven(@PathVariable int num) {
		return checkOddorEven.oddOrEven(num);
	}
}
