package com.assignment8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment8.service.PalindromeService;

@RestController
public class PalindromeController {
	
	private PalindromeService checkPalindromeOrNot;
	
	// http://localhost:8080/palindrome/madam
	@GetMapping("/palindrome/{str}")
	public String checkThePalindrome(@PathVariable String str) {
		return checkPalindromeOrNot.checkPalindrome(str);
	}
}
