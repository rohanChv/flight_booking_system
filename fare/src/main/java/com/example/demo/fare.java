package com.example.demo;


import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fare")
public class fare {
	@Indexed(unique=true)
	String fid;

	String economy,premium_economy,business,fist_class,date,route;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}

	public String getPremium_economy() {
		return premium_economy;
	}

	public void setPremium_economy(String premium_economy) {
		this.premium_economy = premium_economy;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getFist_class() {
		return fist_class;
	}

	public void setFist_class(String fist_class) {
		this.fist_class = fist_class;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public fare(String fid, String economy, String premium_economy, String business, String fist_class, String date,
			String route) {
		super();
		this.fid = fid;
		this.economy = economy;
		this.premium_economy = premium_economy;
		this.business = business;
		this.fist_class = fist_class;
		this.date = date;
		this.route = route;
	}		
}
