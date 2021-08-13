package com.group6.def;

import java.util.Scanner;

<<<<<<< HEAD
import com.group6.key.Key_CHUNGJ;
=======
import com.group6.desktop.DeskTop;
>>>>>>> 9d599beba8d210314128bf37403a899f5052b0dc
import com.group6.moniter.Moniter_soyoung;

import com.group6.mouse.mouse_joohui;

import com.group6.speaker.Speaker;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
<<<<<<< HEAD
		Moniter_soyoung mon = new Moniter_soyoung();  
		Key_CHUNGJ key=new Key_CHUNGJ();
		
		System.out.println("--- 컴퓨터 ---");
		while(true) {
			System.out.println("1.�����");	//�ּҿ�
			System.out.println("2.��ü");		//ȫ�ظ�
			System.out.println("3.����Ŀ");	//����ȯ
			System.out.println("4.���콺");	//����
			System.out.println("5.Ű����");	//��û��
			System.out.println("6.키보드");
=======
		int hjmnum = 0;
		Moniter_soyoung mon = new Moniter_soyoung();
		Speaker spe = new Speaker();
		DeskTop hjm = new DeskTop();
		mouse_joohui mou = new mouse_joohui();

		System.out.println("--- 컴퓨터 ---");
		while (true) {
			System.out.println("1.모니터");
			System.out.println("2.본체");
			System.out.println("3.스피커");
			System.out.println("4.마우스");
			System.out.println("5.키보드");
			System.out.println("6.종료");
>>>>>>> 9d599beba8d210314128bf37403a899f5052b0dc
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				mon.menu();
				int num = mon.input();
				
				switch (num) {
				case 1:
					mon.moniterOnOFf();
					break;
				case 2:
					mon.viewLight();
					break;
				case 3:
					System.out.print("변경할 밝기 ");
					int light = mon.input();
					mon.changeLightNumber(light);
					mon.viewLight();
					break;
				case 4:
					System.out.println("화살표로 밝기를 조정해주세요");
					System.out.println("< : 밝기 감소, > : 밝기 증가");
					System.out.print("입력 : ");
					String arrow = new Scanner(System.in).next();
					mon.changeLightArrow(arrow);
					mon.viewLight();
					break;
				case 5:
					mon.viewLightMod();
					System.out.print("밝기 모드 선택 ");
					int mod = mon.input();
					mon.changeMode(mod);
					mon.viewLight();
					break;
				case 6:
					System.out.println("닫기");
					break;
				}

			case 2:
				int num1 = 0;
				if (hjmnum == 0) {
					hjm.PowerOn();
					hjmnum++;
				}
				System.out.println("=============");
				System.out.println("1.쿨러설정 2.재부팅");
				num = sc.nextInt();
				if (num == 1) {
					hjm.cooler();
				} else if (num == 2) {
					hjm.reboot();
				}
				break;
			case 3:
				spe.display();
				break;
			case 4:
				mou.Mouse();

				break;
<<<<<<< HEAD
			case 5 :
				
			
=======
			case 5:
>>>>>>> 9d599beba8d210314128bf37403a899f5052b0dc
				break;
			case 6:
				System.out.println("종료 합니다");
				return;
			}
		}
	}
}
