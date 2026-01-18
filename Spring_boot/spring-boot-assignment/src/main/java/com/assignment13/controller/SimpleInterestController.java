package com.assignment13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment13.service.SimpleInterestService;

@RestController
public class SimpleInterestController {

	@Autowired
	private SimpleInterestService findSI;
	
	//http://localhost:8080/interest?p=1000&r=10&t=2
	@GetMapping("/interest")
	public Double findSimpleInterest(@RequestParam int p,@RequestParam int r,@RequestParam int t) {
		return findSI.claculateSI(p, r, t);
	}
	
}
