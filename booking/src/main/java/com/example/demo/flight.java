package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="flight")
public class flight {
String route,name;

public flight(String route, String name) {
	super();
	this.route = route;
	this.name = name;
}

public String getRoute() {
	return route;
}

public void setRoute(String route) {
	this.route = route;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
