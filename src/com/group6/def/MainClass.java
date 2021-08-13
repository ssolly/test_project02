package com.group6.def;

import java.util.Scanner;

import com.group6.moniter.Moniter_soyoung;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		Moniter_soyoung mon = new Moniter_soyoung();  
		
		System.out.println("--- 컴퓨터 ---");
		while(true) {
			System.out.println("1.모니터");	//최소영
			System.out.println("2.본체");		//홍준모
			System.out.println("3.스피커");	//정선환
			System.out.println("4.마우스");	//주희
			System.out.println("5.키보드");	//정청하
			System.out.println("6.닫기");
			System.out.print(">>> ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				mon.menu();
				int num = mon.input();
		
				switch (num) {
				case 1 : 
					mon.moniterOnOFf();
					break;
				case 2 : 
					mon.viewLight();
					break;
				case 3 :
					System.out.print("변경할 밝기 ");
					int light = mon.input();
					mon.changeLightNumber(light);
					mon.viewLight();
					break;
				case 4 :
					System.out.println("화살표로 밝기를 조정해주세요");
					System.out.println("< : 밝기 감소, > : 밝기 증가");
					System.out.print("입력 : ");
					String arrow = new Scanner(System.in).next();
					mon.changeLightArrow(arrow);
					mon.viewLight();
					break;
				case 5 :
					mon.viewLightMod();
					System.out.print("밝기 모드 선택 ");
					int mod = mon.input();
					mon.changeMode(mod);
					mon.viewLight();
					break;
				case 6 :
					System.out.println("닫기");
					break;
				}
			
			case 2 :
				break;	
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				return;
			}
		}
	}
}
