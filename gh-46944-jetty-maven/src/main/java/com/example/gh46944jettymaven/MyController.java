package com.example.gh46944jettymaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello")
	String hello() {
		return "Hello Jetty Maven";
	}
	
}
