package com.monster.echidna.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController: Passing through...");
		
		return "home";
	}
	
	
}