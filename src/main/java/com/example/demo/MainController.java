package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/email-verification")
	public String index() {
		System.out.println("hello");
		return "index";
	}
	
	@GetMapping("/password-reset")
	public String passwordReset() {
		return "password-reset";
	}
}
