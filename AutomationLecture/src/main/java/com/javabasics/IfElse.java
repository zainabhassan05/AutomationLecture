package com.javabasics;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2+2);
		addition();
		int x = 10;
		int y = 20;
		
		if(y > x) {
			System.out.println("20 is greater than 10");
		}
		else {
			System.out.println("20 is not greater than 10");
		}

	}
	public static void addition() {
		System.out.println(5+5);		
	}

	public static void subtraction() {
		System.out.println(15+5);		
	}
	
	public static void division() {
		System.out.println(15/5);		
	}
}
