package com.group6.def;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("--- ��ǻ�� ---");
		while(true) {
			System.out.println("1.�����");	//�ּҿ�
			System.out.println("2.��ü");		//ȫ�ظ�
			System.out.println("3.����Ŀ");	//����ȯ
			System.out.println("4.���콺");	//����
			System.out.println("5.Ű����");	//Ű����
			System.out.println("6.�ݱ�");
			System.out.print(">>>> : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("�����");
				break;	
			case 2 :
				break;	
			case 3 :
				break;
			case 4 :
				System.out.println("���콺 �۵�");
				break;
			case 5 :
				break;
			case 6 :
				return;
			}
		}
	}
}
