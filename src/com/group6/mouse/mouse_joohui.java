package com.group6.mouse;

import java.util.Scanner;

public class mouse_joohui {
	
	Scanner input = new Scanner(System.in);
	
	public void Mouse() {
		System.out.println("���콺 ����");
		boolean button = false;
		int num, speed;
	while(true) {
		System.out.println("1.���콺 ��ư ����");
		System.out.println("2.Ŀ�� ũ�� ����");
		System.out.println("3.Ŀ�� �ӵ� ����");
		System.out.println("4.���콺 ���� ����");
		System.out.println(">>> : ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			if(button == true) {
				System.out.println("���� ��ư ���õ�");
			}else {
				System.out.println("���� ��ư ���õ�");
			}
			System.out.println("��ư ����");
			break;
		case 2:
			System.out.println("ũ�⸦ �����ϼ���");
			System.out.println("1.1point 2.2point 3.3point");
			num = input.nextInt();
			System.out.println(num + "ũ�Ⱑ ���� �Ǿ����ϴ�.");
			break;
		case 3:
			System.out.println("�ӵ��� �����ϼ���");
			System.out.println("1.1seed 2.2speed 3.3speed 4.4speed 5.5speed");
			speed = input.nextInt();
			System.out.println(speed + "�ӵ��� ���� �Ǿ����ϴ�.");
			break;
			default:
				System.out.println("�� �� ���� �߽��ϴ�.");
			case 4:
				return;
		}
		
	}
		
	}
}
