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
			
		}else {
			System.out.println("������ ���ϴ�");
			System.exit(0);
		}
	}
		
		public void cooler () {
			Scanner scan =new Scanner(System.in);
			System.out.println("�𷯴� 1~5��");
			System.out.println("up , down �� �Է�");
			System.out.print(">>>");
			String str=scan.next();
			if(str.contains("up")) {
				this.cnt++;
				if(cnt==6) {
					System.out.println("�� �ӵ��� 5�� ���� �Դϴ�");
					this.cnt--;
					System.out.println("���� �� �ӵ� :" + this.cnt);
					return;
				}
				System.out.println("�� �ӵ��� ���������ϴ�");
				System.out.println("���� �� �ӵ� :" + this.cnt);
			}else if(str.contains("down")) {
				this.cnt--;
				if(this.cnt<0) {
					System.out.println("�𷯰� �����ֽ��ϴ�");
					this.cnt++;
					return;
				}
				System.out.println("�� �ӵ��� �پ����ϴ�");
				System.out.println("���� �� �ӵ� :" + this.cnt);
		}
		
		}	
		
	
			
		
		
		
		
		
		
		
		
}
