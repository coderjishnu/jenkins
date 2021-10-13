package com.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class jenkinsController {

	@GetMapping("/")

	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}
