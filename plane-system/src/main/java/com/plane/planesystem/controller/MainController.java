package com.plane.planesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/plane")
public class MainController {
	@GetMapping()
	public String hello() {
		return "Hello World!";
	}
}
