package com.docker.SpringappImage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public void getHello(){
		System.out.println("hello");
	}
}
