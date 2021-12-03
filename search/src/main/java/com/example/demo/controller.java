package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class controller {
	@Autowired
	repo rp;
	@GetMapping("/flight/{route}/{date}")
	public List<flight_info> getdata(@PathVariable String route,@PathVariable String date){		
		return rp.findflight(route,date);
	}
	@PostMapping("/flight/add")
	public String getdata(@RequestBody flight_info f1){		
		try {
			rp.insert(f1);
			return "sucessful insert";
		}catch(Exception e) {
			return "sorry unable to insert";
		}
	}
}