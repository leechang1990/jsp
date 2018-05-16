package com.home.work.anno.car.impl;

import org.springframework.stereotype.Component;

import com.home.work.anno.car.Car;

@Component
public class Audi implements Car {
	private final int PRICE = 10000000;
	
	@Override
	public void price(int money) {
		if(money>PRICE) {
			
			System.out.println("Audi");
		}
	}
}
