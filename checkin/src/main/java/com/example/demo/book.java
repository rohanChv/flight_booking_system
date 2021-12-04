package com.example.demo;
public class book {
	String fid,fare,fclass,status,name;
    String payment_status;
	public book(String fid, String fare, String fclass, String status, String name,String payment_status) {
		super();
		this.fid = fid;
		this.fare = fare;
		this.fclass = fclass;
		this.status = status;
		this.name = name;
		this.payment_status=payment_status;
	}
	public String getfid() {
		return fid;
	}
	public void setfid(String fid) {
		this.fid = fid;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	
	
}
