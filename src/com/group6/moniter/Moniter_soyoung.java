package com.group6.moniter;

import java.util.Scanner;

public class Moniter_soyoung {

	public void menu() {
		System.out.println("1.전원");		//moniterOnOff
		System.out.println("2.밝기 정보");
		System.out.println("3.밝기 선택");
		System.out.println("4.밝기 조정");
		System.out.println("5.밝기 모드 선택");
		System.out.println("6.창 닫기");
	}
	
	private int light,min=1,max=100;
	private String lightMod;
	
	//밝기 정보 
	public void viewLight() {
		if (light==0 && lightMod==null) {
			setLight(50); 
			setLightMod("일반 모드");
			System.out.println("밝기 : " + getLight() + " 모드 : " + getLightMod());
		} else {
			System.out.println("밝기 : " + getLight() + " 모드 : " + getLightMod());	
		}
	}
	
	//모니터 전원
	public void moniterOnOFf() {
		System.out.println("1. 전원 ON");
		System.out.println("1. 전원 OFF");
		int num = input();
		
		switch(num) {
		case 1 : 
			moniterOn();
			break;
		case 0 :
			moniterOff();
			break;
		default :
			System.out.println("오류");
			
		}
	}
	
	public void moniterOn() {
		System.out.println("화면이 켜졌습니다");
	}
	
	public void moniterOff() {
		System.out.println("화면이 꺼졌습니다");
	}
	
	//모니터 밝기 조정
	//기본값 세팅(50), 최소값 최대값 지정, 화살표/숫자로 밝기 조정
	

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}
	
	public int changeLightNumber(int num) {
		if(num>=min && num<=max) {
			setLight(num);
			return light;
		} else {
			System.out.println("오류 : 밝기는 1-100사이로 선택할 수 있습니다");
			return light;
		}
	}
	
	public void changeLightArrow(String arrow) {
		
		char firstArrow = arrow.charAt(0);
		
		if((light+arrow.length())>max) {
			System.out.println("오류 : 밝기 최대값 "+max+"을 초과했습니다");
		} else if ((light+arrow.length())<min) {
			System.out.println("오류 : 밝기가 최소값"+min+"보다 작습니다");
		} else if (firstArrow=='<'){
			this.light = light - arrow.length();
			System.out.println("수정 후 밝기 : " + light);
		} else if (firstArrow == '>') {
			this.light = light + arrow.length();
			System.out.println("수정 후 밝기 : " + light);
		}
	}
	
	
	public String getLightMod() {
		return lightMod;
	}

	public void setLightMod(String lightMod) {
		this.lightMod = lightMod;
	}

	public void viewLightMod() {
		System.out.println("1.일반 모드");
		System.out.println("2.읽기 모드");
		System.out.println("3.영상 시청 모드");
		System.out.println("4.블루라이트 차단 모드");
	}
	
	public String changeMode(int num) {	
		switch (num) {
			case 1 : 
				setLightMod("일반 모드");
				return getLightMod();
			case 2 :
				setLightMod("읽기 모드");
				return getLightMod();
			case 3 :
				setLightMod("영상 시청 모드");
				return getLightMod();
			case 4 :
				setLightMod("블루라이트 차단 모드");
				return getLightMod();
			default :
				return getLightMod();	
			}
	}
	
	public int input() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		choice = sc.nextInt();
		return choice;
	}
	
}
