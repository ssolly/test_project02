package com.group6.desktop;

import java.util.Scanner;

public class DeskTop {
	public void PowerOn() {
		Scanner scan =new Scanner(System.in);
		System.out.println("1.ON 2.OFF");
		System.out.print(">>>");
		int num =scan.nextInt();
		if(num == 1) {
			System.out.println("전원을 켭니다");
			System.out.println("Hello World!");
			
		}else {
			System.out.println("전원을 끕니다");
			System.exit(0);
		}
	}
}
