package com.group6.def;

import java.util.Scanner;

import com.group6.desktop.DeskTop;
import com.group6.moniter.Moniter_soyoung;

import com.group6.mouse.mouse_joohui;

import com.group6.speaker.Speaker;


public class MainClass {
	public static void main(String[] args) {
		DeskTop hjm = new DeskTop();
		mouse_joohui mou = new mouse_joohui();
		Scanner sc = new Scanner(System.in);
int choice;
		int hjmnum=0;
		Moniter_soyoung mon = new Moniter_soyoung();  
		Speaker spe = new Speaker();
		
		System.out.println("--- 컴퓨터 ---");
		while(true) {
			System.out.println("1.모니터");	//�ּҿ�
			System.out.println("2.본체");		//ȫ�ظ�
			System.out.println("3.스피커");	//����ȯ
			System.out.println("4.마우스");	//����
			System.out.println("5.키보드");	//��û��
			System.out.println("6.종료");
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				
				mon.bootUp();
				mon.bootDown();
				break;	
			case 2 :
				int num=0;
				if(hjmnum==0) {
				hjm.PowerOn();
				hjmnum++;
				}
				System.out.println("=============");
				System.out.println("1.쿨러설정 2.재부팅");
				 num = sc.nextInt();
				 if(num==1) {
					hjm.cooler();
				}else if(num==2) {
					hjm.reboot();
				}
				 break;
			case 3 :
				spe.speakerOn();
				spe.speakerOff();
				break;
			case 4 :
				mou.Mouse();
				break;
			case 5 :
				break;
			case 6 :
				System.out.println("종료 합니다");
				return;
			}
		}
	}
}
