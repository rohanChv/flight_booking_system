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
@RequestMapping("/booking")
public class controller {
@Autowired
repo rp;

	@PostMapping("/book")
	public String add(@RequestBody book b1) {
		try {
			rp.insert(b1);
			return "sucess";
		}catch(Exception e) {
			return "cannot book";
		}	
	}
	
@GetMapping("/cancel/{fid}/{name}")
	public String cancel(@PathVariable String fid,@PathVariable String name){
		try
	  	{ 
		book b1=rp.get(fid, name);
	  	rp.delete(fid, name);
	  	b1.setStatus("cancelled"); 
	  	rp.insert(b1);
	  	return "good"; 
	  }catch(Exception e) { 
		  return e.getMessage();
		  }
	}
	 
	 @GetMapping("/mybookings/{name}")
	 public List<book>getdata(@PathVariable String name){
		 return rp.get(name);
	 }
	
	
}
