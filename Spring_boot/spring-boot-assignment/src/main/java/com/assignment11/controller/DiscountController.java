package com.assignment11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment11.service.DiscountService;


@RestController
public class DiscountController {
	
	@Autowired
	private DiscountService findDiscountofproduct;
	
	// http://localhost:8080/discount?price=1000&discount=10
	@GetMapping("/discount")
	public double findTheDiscount(@RequestParam int price,@RequestParam int discount) {
		return findDiscountofproduct.findDiscount(price, discount);
	}
	
}
