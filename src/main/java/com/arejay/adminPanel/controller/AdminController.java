package com.arejay.adminPanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AdminController {
	@GetMapping("/admin")
	public String LoginPage() {
		
		return "showMyLoginPage";
	}
	
	@GetMapping("/error")
	public String accessDenied() {
		
		return "accessDenied";
	}

}
