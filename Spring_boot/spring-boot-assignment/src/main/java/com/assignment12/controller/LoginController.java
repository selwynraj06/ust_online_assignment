package com.assignment12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment12.Dto.LoginRequest;
import com.assignment12.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginStatusCheck;
	
	//http://localhost:8080/login
	@PostMapping("/login")
	public String checkLoginStatus(@RequestBody LoginRequest request) {
		return loginStatusCheck.checkLogin(request.getUsername(), request.getPassword());
	}
	
}
