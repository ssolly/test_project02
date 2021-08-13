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
			
		}else {
			System.out.println("전원을 끕니다");
			System.exit(0);
		}
	}
		
		public void cooler () {
			Scanner scan =new Scanner(System.in);
			System.out.println("쿨러는 1~5단");
			System.out.println("up , down 중 입력");
			System.out.print(">>>");
			String str=scan.next();
			if(str.contains("up")) {
				this.cnt++;
				if(cnt==6) {
					System.out.println("팬 속도는 5단 까지 입니다");
					this.cnt--;
					System.out.println("현재 쿨러 속도 :" + this.cnt);
					return;
				}
				System.out.println("팬 속도가 빨라졌습니다");
				System.out.println("현재 쿨러 속도 :" + this.cnt);
			}else if(str.contains("down")) {
				this.cnt--;
				if(this.cnt<0) {
					System.out.println("쿨러가 멈춰있습니다");
					this.cnt++;
					return;
				}
				System.out.println("팬 속도가 줄었습니다");
				System.out.println("현재 쿨러 속도 :" + this.cnt);
		}
		
		}	
		
	
			
		
		
		
		
		
		
		
		
}
