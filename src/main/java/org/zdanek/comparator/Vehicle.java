package org.zdanek.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Vehicle {
	
	
	private int type;
	private String manufacturer;
	private String model;
	private String engine;

}