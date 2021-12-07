package com.example.demo1;

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
@Autowired
service_layer s;
	@GetMapping("/book/{name}")
	public String add(@PathVariable String name) {
		
		try {
			book ba=s.add(name);
			String fid=ba.getfid();
			book b2=rp.get(fid, name);
			if(b2==null) {
				rp.insert(ba);
				return "ticket is booked."+"\nname:"+name+"\nclass:"+ba.getFclass()+"\npayment:"+ba.getPayment_status();
			}
			else
				if(b2.getfid().contentEquals(fid)&&b2.getName().contentEquals(name)) {
					return "dear user a ticket is booked already with same name in same flight.check credentials to avoid financial loss";
				}
				else
					return "unusual exit";

			
		}catch(Exception e) {
			return e.getMessage();
		}	
	}
	
@GetMapping("/cancel/{fid}/{name}")
	public String cancel(@PathVariable String fid,@PathVariable String name){
		try
	  	{  
	  	rp.delete(fid, name);
	  	return "booking canceled"; 
	  }catch(Exception e) { 
		  return e.getMessage();
		  }
	}
	 
	 @GetMapping("/mybookings/{name}")
	 public List<book>getdata(@PathVariable String name){
		 return rp.get(name);
	 }		
}
