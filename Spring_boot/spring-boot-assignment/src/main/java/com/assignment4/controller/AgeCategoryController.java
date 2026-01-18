package com.assignment4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment4.service.AgeCategoryService;

@RestController
public class AgeCategoryController {
	
	@Autowired
	private AgeCategoryService checkAgeService;
	
	// http://localhost:8080/age/10
	@GetMapping("/age/{age}")
	public String ageCategory(@PathVariable int age) {
		return checkAgeService.checkAge(age);
	}
}
