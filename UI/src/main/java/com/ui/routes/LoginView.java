package com.ui.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginView {
	@GetMapping("/")
	public String login1() {
		return "login";
	}
	
	@GetMapping("/login")
	public String login2() {
		return "login";
	}
}
