package org.zdanek.comparator;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class ComparatorTest {
	
	 private static final Logger logger = LogManager.getLogger(ComparatorTest.class);
	
	
	public static void main(String[] args) {
		logger.debug("compareListTest()");
		
		List<Vehicle> vehiclesMap= new ArrayList<Vehicle>();
		vehiclesMap.add(new Vehicle(1,"suzuki","freewind","650"));
		vehiclesMap.add(new Vehicle(1,"bmw","cs","650"));
		vehiclesMap.add(new Vehicle(1,"aprilia","pegaso","650"));
		
		
		
		vehiclesMap.forEach(vehicle->logger.debug(vehicle.toString()));
	}

}
