package com.assignment8.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
	
	public String checkPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		if(str.equals(sb.reverse())) {
			return "THe Given String is Palindrome";
		}
		else {
			return "THe Given String is Not Palindrome";
		}
	}
}
