package com.group6.desktop;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class DeskTop {
	int cnt=1;
	public void PowerOn() {
		Scanner scan =new Scanner(System.in);
		System.out.println("전원을 켜시려면 1.ON 2.OFF");
		System.out.print(">>>");
		int num =scan.nextInt();
		if(num == 1) {
			System.out.println("전원을 켭니다");
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
			System.out.println("전원을 끕니다");
			System.exit(0);
		}
	}
		
		public void cooler () {
			Scanner scan =new Scanner(System.in);
			System.out.println("쿨러는 0~5단");
			System.out.println("up , down 중 입력");
			System.out.print(">>>");
			String str=scan.next();
			if(str.contains("up")) {
				this.cnt++;
				if(cnt==6) {
					System.out.println("팬 속도는 5단 까지 입니다");
					this.cnt--;
					System.out.println("현재 쿨러 속도 :" + this.cnt);
					System.out.println("===================");
					return;
				}
				System.out.println("팬 속도가 빨라졌습니다");
				System.out.println("현재 쿨러 속도 :" + this.cnt);
				System.out.println("===================");
			}else if(str.contains("down")) {
				this.cnt--;
				if(this.cnt<0) {
					System.out.println("쿨러가 멈춰있습니다");
					this.cnt++;
					System.out.println("===================");
					return;
				}
				System.out.println("팬 속도가 줄었습니다");
				System.out.println("현재 쿨러 속도 :" + this.cnt);
				System.out.println("===================");
		}
		
		}	
		public void reboot() {
			System.out.println("컴퓨터를 재부팅 합니다.");
			System.out.println("소요 시간: 6초");
			try {
				for(int i =1; i<7; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i+"초...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("재부팅 완료");
			System.out.println("===================");
			return;
	
		
		}
		public void cls() {
			for(int i =0; i<10; i++) {
				System.out.println();
			}
				
		}
		
}
