package com.example.demo;



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
	public String cancel(@PathVariable String fid,@PathVariable String name) {
		try {
			book b1=rp.get(fid, name);
			rp.deleteById(fid);
			b1.setStatus("cancelled");
			rp.insert(b1);
			return "canceled";
		}catch(Exception e) {
			return "sorry unable to cancel";
		}
	}
	@GetMapping("/mybookings/{name}")
	public book getBooking(@PathVariable String name) {
			return rp.getbooking(name).orElseThrow(()->new RuntimeException(String.format("no data found")));
	}
}
