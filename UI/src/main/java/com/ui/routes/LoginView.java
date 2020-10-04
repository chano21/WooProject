package com.ui.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginView {
	@GetMapping("/login")
	public String login_view() {
		return "login";
	}
}
