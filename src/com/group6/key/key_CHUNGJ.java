package com.group6.key;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Key_CHUNGJ{
	
	
    public static void main(String[] args) {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter : ");
        
        try {
            String s = br.readLine();
            System.out.println(s);
            
        }catch(Exception e) {
            System.out.println(e);
            
        }
    }
}