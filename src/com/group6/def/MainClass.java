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
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				mon.bootUp();
				mon.bootDown();
				break;	
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
