package com.assignment15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment15.service.MaxMinService;

@RestController
public class MaxMinController {
	
	@Autowired
	private MaxMinService maximumOfThree;
	
	@GetMapping("/max")
	public int findMaxOfThree(@RequestParam int a,@RequestParam int b,@RequestParam int c) {
		return maximumOfThree.findMax(a, b, c);
	}
}
