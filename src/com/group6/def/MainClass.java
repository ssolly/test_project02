package com.group6.def;

import java.util.Scanner;

import com.group6.desktop.DeskTop;

public class MainClass {

	public static void main(String[] args) {
		DeskTop hjm = new DeskTop();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("--- 컴퓨터 ---");
		while(true) {
			System.out.println("1.모니터");	//최소영
			System.out.println("2.본체");		//홍준모
			System.out.println("3.스피커");	//정선환
			System.out.println("4.마우스");	//주희
			System.out.println("5.키보드");	//키보드
			System.out.println("6.닫기");
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("냉장고");
				break;	
			case 2 :
				hjm.PowerOn();
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
