package com.spring.Sujith.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Bike is Running...");
	}

}
