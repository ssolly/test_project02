package com.group6.speaker;

import java.util.Scanner;

public class Speaker {
	
	Scanner input = new Scanner(System.in);
	int vol=0;
	
	public void speakerOn() {
		System.out.println("이 스피커는 하만카돈 사운드스틱4입니다.");
	}
	
	public void control() {
		System.out.println("1.볼륨업 2.볼륨다운");
		int select = input.nextInt();
		if (select==1 || select==2) {
			switch (select) {
			case 1 :
				System.out.println("볼륨을 하나 올립니다.");
				vol++;
				System.out.println("볼륨 : "+vol);
				break;
			case 2 :
				System.out.println("볼륨을 하나 내립니다.");
				vol--;
				System.out.println("볼륨 : "+vol);
				break;
			}
		}else {
			System.out.println("1 혹은 2를 입력해주세요.");
		}
		
	}
	
	public void mute() {
		int a = vol;
		System.out.println("음소거를 합니다(yes/no)");
		String select = input.next();
		
		if (select.equals("yes")) {
		System.out.println("뮤트 합니다.");
		vol = 0;
		System.out.println("볼륨 : "+vol);
		
		while(true) {
			System.out.println("음소거를 해제합니다(yes/no)");
			select = input.next();
			if (select.equals("yes")) {
				System.out.println("뮤트를 해제합니다.");
				vol = a;
				System.out.println("볼륨 : "+vol);
				return;
				} else {
					continue;
				}
		} 
		} else {
			System.out.println("뮤트를 취소합니다");
		}
		
		}
	public void speakerOff() {
		System.out.println("스피커를 끕니다");
		return;
	}
	
	public void display() {
		while(true) {
		System.out.println("1.스피커 제품 확인");
		System.out.println("2.스피커 볼륨 조절");
		System.out.println("3.스피커 음소거");
		System.out.println("4.스피커 전원 끄기");
		System.out.print(">>>");
		int select = input.nextInt();
		switch(select) {
		case 1 :
			speakerOn();
			break;
		case 2 :
			control();
			break;
		case 3 :
			mute();
			break;
		case 4 :
			speakerOff();
			return;
		}
		}
		
		
	}

}
