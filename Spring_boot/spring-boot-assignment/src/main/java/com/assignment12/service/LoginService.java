package com.assignment12.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public String checkLogin(String username,String password) {
		if(username.equals("admin") && password.equals("admin123")) {
			return "Login Success";
		}
		else {
			return "Login Failed";
		}
	}
	
}
