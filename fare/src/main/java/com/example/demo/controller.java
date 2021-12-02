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
serv s1=new serv();
@GetMapping("/{id}")
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
@GetMapping("/{id}/{type}/select")
public String getfare(@PathVariable String id,@PathVariable String type) {
	fare f1=rp.getobj(id);
	return "your seat is selected.please confirm.\nformat:class,fare\n"+s1.getdata(f1, type)+","+s1.fr();
}

@GetMapping("/{id}/{type}/select/confirm")
public String getcon() {
	return "flight id:"+s1.fid();
}
@GetMapping("/id")
public String getid() {
	return s1.fid();
}
@GetMapping("/class")
public String getclass() {
	return s1.fcl();
}
@GetMapping("/fare")
public String fare() {
	return s1.fr();
}
}

