package com.admin.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@GetMapping("/index")
	public String mainpage() {
		
		return "Hello World";
	}
	
	@GetMapping("/user")
	public String user() {
		
		return "hello user";
	}
}
