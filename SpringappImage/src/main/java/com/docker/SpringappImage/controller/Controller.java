package com.docker.SpringappImage.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.docker.SpringappImage.dto.LoginRequest;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String getHello(){
		return new String("Hello World");
	}

	/*
	 * @PostMapping("/login") public ResponseEntity<String> LoginUser(
	 * 
	 * @RequestBody LoginRequest login) { return
	 * ResponseEntity.ok("login successfull");
	 * 
	 * }
	 */
	
	@GetMapping("/login")
	public String showLoginMessage() {
	    return "This endpoint requires POST — please submit username & password.";
	}
}
