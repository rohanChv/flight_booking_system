package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkin")
public class controller {
	@RequestMapping()
	public String hey() {
		return "hey";
	}
}
