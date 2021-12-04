package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="t1",url="http://localhost:8084/search")
public interface check_serv {
@GetMapping("/hello/{fid}")
public String getfrd(@PathVariable String fid);
}
