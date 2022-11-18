package com.springsecuritywithmysqldb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure/auth")
public class ApplicationAuthController {
	
	
	@GetMapping("/rest/process")
	public String process()
	{
		return "Successfully authorized spring boot application using security with database";
	}

}
