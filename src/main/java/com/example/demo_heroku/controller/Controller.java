package com.example.demo_heroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/demo")
	public String hello()
	{
		return "Updated_deployement is done:";
		
	}

}
