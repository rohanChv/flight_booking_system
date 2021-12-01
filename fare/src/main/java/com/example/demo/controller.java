package com.example.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fare")
public class controller {
@Autowired
repo rp;

@GetMapping("/getfare/{id}")
public Optional<fare> getfare(@PathVariable String id) {
	return rp.getinfo(id);
}
@PostMapping("/getfare/add")
public String add(@RequestBody fare f1) {
	try {
		rp.insert(f1);
		return "sucess";
	}catch(Exception e) {
		return "sorry problem in creation ";
	}
	
}
}

