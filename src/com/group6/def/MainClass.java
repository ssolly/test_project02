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
		Moniter_soyoung mon = new Moniter_soyoung();  
		Speaker spe = new Speaker();
		
		System.out.println("--- ��ǻ�� ---");
		while(true) {
			System.out.println("1.�����");	//�ּҿ�
			System.out.println("2.��ü");		//ȫ�ظ�
			System.out.println("3.����Ŀ");	//����ȯ
			System.out.println("4.���콺");	//����
			System.out.println("5.Ű����");	//��û��
			System.out.println("6.�ݱ�");
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				mon.bootUp();
				mon.bootDown();
				break;	
			case 2 :
				hjm.PowerOn();
				break;	
			case 3 :
				spe.display();
				break;
			case 4 :
				mou.Mouse();
				
				break;
			case 5 :
				break;
			case 6 :
				return;
			}
		}
	}
}
