package com.home.work.play;

import java.util.Scanner;

public class act {
	public int playLotto(int money) {
		
		int random =(int)  (Math.random()*100)+1;
		Scanner s= new Scanner(System.in);
		System.out.println("복권 구입 금액을 입력해주세요: ");
		int buyMoney=s.nextInt();
		if(buyMoney>money) {
			System.out.println("소지금액보다 구입금액이 큽니다");
		}
		money = money-buyMoney;
		if(random==100) {
			buyMoney=buyMoney*100;
		}else if(random>90) {
			buyMoney=buyMoney*10;
		}else if(random>80) {
			buyMoney=buyMoney*2;
		}else if(random>50) {
			buyMoney=(int)(buyMoney * 1.5);
		}
		return money+buyMoney;
	}
	public int work(int money) {
		System.out.println("사용자가 일중입니다.");
		return money+1;
	}
}
