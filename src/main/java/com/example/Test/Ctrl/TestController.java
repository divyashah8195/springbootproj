package com.example.Test.Ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/home")
	public String home() {
		return "Hello World";
	}

}
