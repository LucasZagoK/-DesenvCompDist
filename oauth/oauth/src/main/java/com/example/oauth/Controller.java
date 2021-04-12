package com.example.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/restricted")
	public String restricted() {
		return "You are able to see this if you are logged";
	}
}
