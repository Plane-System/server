package com.plane.planesystem.controller;

import com.plane.planesystem.annotation.ApiPrefixController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiPrefixController()
public class MainController {
	@GetMapping(path = "hello")
	public String hello() {
		return "Hello World!";
	}
}
