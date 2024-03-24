package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	/* http://localhost:8080/greeting */
	@GetMapping("/greeting")
	@ResponseBody
	public String greeting() {
		
		return "<h1>Welcome to Spring Web Application<h1>";
		
	}
	
	/* http://localhost:8080/welcome */
	@GetMapping("/welcome")
	public String welcome() {
		/* welcome.html */
		return "welcome";
		
	}
	
}
