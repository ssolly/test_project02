package com.group6.desktop;

import java.util.Scanner;

public class DeskTop {
	public void PowerOn() {
		Scanner scan =new Scanner(System.in);
		System.out.println("1.ON 2.OFF");
		System.out.print(">>>");
		int num =scan.nextInt();
		if(num == 1) {
			System.out.println("������ �մϴ�");
			System.out.println("Hello World!");
			
		}else {
			System.out.println("������ ���ϴ�");
			System.exit(0);
		}
	}
}
