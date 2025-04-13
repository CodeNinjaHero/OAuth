package com.oauth2.springOauth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String hello(){
		return "Hello, I'm Edwin. This is to test FREE endpoints";
	}

	@GetMapping("/helloSecured")
	public String helloSecured(){
		return "Hello, I'm Edwin. This is to SECURED free endpoints";
	}
}
