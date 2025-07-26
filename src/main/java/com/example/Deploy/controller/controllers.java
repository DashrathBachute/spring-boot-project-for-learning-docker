package com.example.Deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controllers {
	
	
	@GetMapping("/check")
	public String check() {
		return "Hello Dash app is started";
	}
	
	
	@GetMapping("/checks")
	public String checkNew() {
		return "Hello Dash app is started am creatig the new app";
	}
	
	@GetMapping("/now")
	public String checkNow() {
		return "third APi for check ";
	}
	
	
	
	

}
