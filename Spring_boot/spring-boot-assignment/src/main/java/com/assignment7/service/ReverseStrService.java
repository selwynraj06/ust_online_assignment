package com.assignment7.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseStrService {
	
	
	public String revString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}
