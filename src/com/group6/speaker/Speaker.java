package com.group6.speaker;

import java.util.Scanner;

public class Speaker {
	
	Scanner input = new Scanner(System.in);
	int vol=0;
	
	public void speakerOn() {
		System.out.println("�� ����Ŀ�� �ϸ�ī�� ���彺ƽ4�Դϴ�.");
	}
	
	public void control() {
		System.out.println("1.������ 2.�����ٿ�");
		int select = input.nextInt();
		if (select==1 || select==2) {
			switch (select) {
			case 1 :
				System.out.println("������ �ϳ� �ø��ϴ�.");
				vol++;
				System.out.println("���� : "+vol);
				break;
			case 2 :
				System.out.println("������ �ϳ� �����ϴ�.");
				vol--;
				System.out.println("���� : "+vol);
				break;
			}
		}else {
			System.out.println("1 Ȥ�� 2�� �Է����ּ���.");
		}
		
	}
	
	public void mute() {
		int a = vol;
		System.out.println("���ҰŸ� �մϴ�(yes/no)");
		String select = input.next();
		
		if (select.equals("yes")) {
		System.out.println("��Ʈ �մϴ�.");
		vol = 0;
		System.out.println("���� : "+vol);
		
		while(true) {
			System.out.println("���ҰŸ� �����մϴ�(yes/no)");
			select = input.next();
			if (select.equals("yes")) {
				System.out.println("��Ʈ�� �����մϴ�.");
				vol = a;
				System.out.println("���� : "+vol);
				return;
				} else {
					continue;
				}
		} 
		} else {
			System.out.println("��Ʈ�� ����մϴ�");
		}
		
		}
	public void speakerOff() {
		System.out.println("����Ŀ�� ���ϴ�");
		return;
	}
	
	public void display() {
		while(true) {
		System.out.println("1.����Ŀ ��ǰ Ȯ��");
		System.out.println("2.����Ŀ ���� ����");
		System.out.println("3.����Ŀ ���Ұ�");
		System.out.println("4.����Ŀ ���� ����");
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
