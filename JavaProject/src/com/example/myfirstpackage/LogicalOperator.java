package com.example.myfirstpackage;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a>b && a>c);
		System.out.println(a>b || a<c);
		System.out.println(a<b && a<c);
		
		boolean isDay = true;
		boolean isNight = false;
		System.out.println("is it night"  + " "+ !isDay);
		
		

	}

}
