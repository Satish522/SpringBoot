package com.satish.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest/")
public class NoAuthController {

	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
}
