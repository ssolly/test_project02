package com.group6.def;

import java.util.Scanner;

import com.group6.key.Key_CHUNGJ;
import com.group6.moniter.Moniter_soyoung;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
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
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				mon.bootUp();
				mon.bootDown();
				break;	
			case 2 :
				break;	
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				
			
				break;
			case 6 :
				return;
			}
		}
	}
}
