package com.group6.desktop;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class DeskTop {
	int cnt=1;
	public void PowerOn() {
		Scanner scan =new Scanner(System.in);
		System.out.println("������ �ѽ÷��� 1.ON 2.OFF");
		System.out.print(">>>");
		int num =scan.nextInt();
		if(num == 1) {
			System.out.println("������ �մϴ�");
			try {
				for(int i =0; i<5; i++) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("....");
				}
				cls();
				System.out.println("=======================\n\n");
				System.out.println("\tWINDOWS\n\n");
				System.out.println("=======================\n\n");
				for(int i =0; i<3; i++) {
					TimeUnit.SECONDS.sleep(1);
				}
				cls();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("������ ���ϴ�");
			System.exit(0);
		}
	}
		
		public void cooler () {
			Scanner scan =new Scanner(System.in);
			System.out.println("�𷯴� 0~5��");
			System.out.println("up , down �� �Է�");
			System.out.print(">>>");
			String str=scan.next();
			if(str.contains("up")) {
				this.cnt++;
				if(cnt==6) {
					System.out.println("�� �ӵ��� 5�� ���� �Դϴ�");
					this.cnt--;
					System.out.println("���� �� �ӵ� :" + this.cnt);
					System.out.println("===================");
					return;
				}
				System.out.println("�� �ӵ��� ���������ϴ�");
				System.out.println("���� �� �ӵ� :" + this.cnt);
				System.out.println("===================");
			}else if(str.contains("down")) {
				this.cnt--;
				if(this.cnt<0) {
					System.out.println("�𷯰� �����ֽ��ϴ�");
					this.cnt++;
					System.out.println("===================");
					return;
				}
				System.out.println("�� �ӵ��� �پ����ϴ�");
				System.out.println("���� �� �ӵ� :" + this.cnt);
				System.out.println("===================");
		}
		
		}	
		public void reboot() {
			System.out.println("��ǻ�͸� ����� �մϴ�.");
			System.out.println("�ҿ� �ð�: 6��");
			try {
				for(int i =1; i<7; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i+"��...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("����� �Ϸ�");
			System.out.println("===================");
			return;
	
		
		}
		public void cls() {
			for(int i =0; i<10; i++) {
				System.out.println();
			}
				
		}
		
}
