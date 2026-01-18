package com.assignment15.service;

import org.springframework.stereotype.Service;

@Service
public class MaxMinService {
	
	public int findMax(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
}
