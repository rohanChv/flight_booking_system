package com.example.demo;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class book {
	String fid;
	
	String name,status,fclass,payment;

	public book(String fid, String name, String status, String fclass, String payment) {
		super();
		this.fid = fid;
		this.name = name;
		this.status = status;
		this.fclass = fclass;
		this.payment = payment;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFclass() {
		return fclass;
	}

	public void setFclass(String fclass) {
		this.fclass = fclass;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	
	
}
