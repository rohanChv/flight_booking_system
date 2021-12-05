package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class service_layer {
	@Autowired
	fserv fs1;
	String fid,fare,fclass,status,name;
	public book add(String name) {
		this.fid=fs1.getid();
		this.fare=fs1.fare();
		this.fclass=fs1.getclass();
		status="booked";
		this.name=name;
		book b1=new book(fid,fare,fclass,status,name,"np");
		return b1;
	}
}
