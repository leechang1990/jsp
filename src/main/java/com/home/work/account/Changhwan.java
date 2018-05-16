package com.home.work.account;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Changhwan {
	private int money;
	private List<String> car;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public List<String> getCar() {
		return car;
	}
	public void setCar(List<String> car) {
		this.car = car;
	}
	
}
