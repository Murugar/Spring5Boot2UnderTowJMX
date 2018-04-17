package com.iqmsoft.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping("/")
	String index() {
		return "Greetings";
	}

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Greetings , " + name + "!";
	}

}