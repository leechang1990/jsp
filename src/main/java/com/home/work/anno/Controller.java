package com.home.work.anno;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.work.anno.car.Car;

@Named
public class Controller {

	@Autowired
	private List<Car> carList;
	
	
	public void printCarList(int money) {
		
		for(Car c: carList) {
			c.price(money);
		}
		
	}
}
