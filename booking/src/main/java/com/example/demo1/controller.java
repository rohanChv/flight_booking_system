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
	String fid,fare,fclass,status,name;
@Autowired
repo rp;
@Autowired
fserv fs1;
	@GetMapping("/book/{name}")
	public String add(@PathVariable String name) {
		try {
			this.fid=fs1.getid();
			this.fare=fs1.fare();
			this.fclass=fs1.getclass();
			status="booked";
			this.name=name;
			book b1=new book(fid,fare,fclass,status,name,"np");
			book b2=rp.get(fid, name);
			if(b2==null) {
				rp.insert(b1);
				return "ticket is booked."+"\nname:"+name+"\nclass:"+b1.getFclass()+"\npayment:"+b1.getPayment_status();
			}
			else
				if(b2.getfid().contentEquals(fid)&&b2.getName().contentEquals(name)) {
					return "dear user a ticket is booked already with same name in same flight.check credentials to avoid financial loss";
				}
				else
					return "normal exit";
			
		}catch(Exception e) {
			return e.getMessage();
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
