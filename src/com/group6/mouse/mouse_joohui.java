package com.group6.mouse;

import java.util.Scanner;

public class mouse_joohui {
	
	Scanner input = new Scanner(System.in);
	
	public void Mouse() {
		System.out.println("마우스 설정");
		boolean button = false;
		int num, speed;
	while(true) {
		System.out.println("1.마우스 버튼 선택");
		System.out.println("2.커서 크기 선택");
		System.out.println("3.커서 속도 선택");
		System.out.println("4.마우스 설정 종료");
		System.out.println(">>> : ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			if(button == true) {
				System.out.println("왼쪽 버튼 선택됨");
			}else {
				System.out.println("우측 버튼 선택됨");
			}
			System.out.println("버튼 선택");
			break;
		case 2:
			System.out.println("크기를 선택하세요");
			System.out.println("1.1point 2.2point 3.3point");
			num = input.nextInt();
			System.out.println(num + "크기가 선택 되었습니다.");
			break;
		case 3:
			System.out.println("속도를 선택하세요");
			System.out.println("1.1seed 2.2speed 3.3speed 4.4speed 5.5speed");
			speed = input.nextInt();
			System.out.println(speed + "속도가 선택 되었습니다.");
			break;
			default:
				System.out.println("잘 못 선택 했습니다.");
			case 4:
				return;
		}
		
	}
		
	}
}
