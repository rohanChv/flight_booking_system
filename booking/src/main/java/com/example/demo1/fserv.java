package com.example.demo1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo",url="http://localhost:8083/fare/")
public interface fserv {
	@GetMapping("/id")
	public String getid() ;
	@GetMapping("/class")
	public String getclass();
	@GetMapping("/fare")
	public String fare();
}
