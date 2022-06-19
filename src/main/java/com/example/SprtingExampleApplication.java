package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprtingExampleApplication {
	
	@GetMapping("/")
	public String message(){
		return "Welcome to Open Shift";
	}
	@GetMapping("/input")
	public String deploy(){
		return "Your application deployed on Open Shift successful";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SprtingExampleApplication.class, args);
	}

}
