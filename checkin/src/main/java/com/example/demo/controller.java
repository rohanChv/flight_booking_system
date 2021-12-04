package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkin")
public class controller {
	@Autowired
	repo rp;
	@Autowired
	check_serv c2;
	@GetMapping("/{name}/{fid}")
	public String hey(@PathVariable String name,@PathVariable String fid) {
		book b1=rp.get(name, fid);
		if(b1.getPayment_status().contains("np")) {
			return "pay the fare";
		}
		return c2.getfrd(fid);
	}
}
