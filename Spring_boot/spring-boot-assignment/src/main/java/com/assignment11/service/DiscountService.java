package com.assignment11.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
	
	public double findDiscount(int price,int discount) {
		return price - ((price*discount)/100);
	}
}
