package com.example.gh46944tomcatgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello")
	String hello() {
		return "Hello Tomcat Gradle";
	}
	
}
