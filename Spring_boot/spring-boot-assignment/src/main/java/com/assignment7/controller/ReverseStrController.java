package com.assignment7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment7.service.ReverseStrService;

@RestController
public class ReverseStrController {

	@Autowired
	private ReverseStrService revTheString;
	
	// http://localhost:8080/reverse/Hello
	@GetMapping("/reverse/{str}")
	public String reveseTheString(@PathVariable String str) {
		return revTheString.revString(str);
	}
	
}
