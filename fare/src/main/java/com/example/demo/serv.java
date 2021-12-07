package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class serv {
	String id,fare,fin="0";
	public String getdata(fare f1,String type) {
		
		id=f1.getFid();
		String t1="economy";
		String t2="premium_economy";
		String t3="business";
		String t4="fist_class";
		if(type.contains(t1)) {
			fare=f1.getEconomy();
			this.fin=fare;
			this.fin=t1;
			return fin;
		}
		else
			if(type.contains(t2)) {
				fare=f1.getPremium_economy();
				this.fin=fare;
				this.fin=t2;
				return fin;
			}
			else
				if(type.contains(t3)) {
					fare=f1.getBusiness();
					this.fin=fare;
					this.fin=t3;
					return fin;
				}
				else
					if(type.contains(t4)) {
						fare=f1.getPremium_economy();
						this.fin=fare;
						this.fin=t4;
						return fin;
					}
					else
						return "na";		
	}
	public String fid() {
		return id;
	}
	public String fcl() {
		return fin;
	}
	public String fr() {
		return fare;
	}
}
