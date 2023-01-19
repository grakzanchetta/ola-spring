package com.hello.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
@SpringBootApplication
public class HelloSpring {
	
		@GetMapping
		public String OlaSpring () {
			return "Ola Spring !!!";		
	}

}