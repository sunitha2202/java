package com.example.myfirstpackage;

public class IfElse {

	public static void main(String[] args) {
		int a = 10;
		String result;
		
		if(a>0){
			System.out.println("a is positive");
			
		}else if(a<0){
			System.out.println("a is negative");
		}
		else {
			System.out.println("a is zero");
		}
		 
		result = (a>0) ? "positive": "negative";
		System.out.println(result);
		
		String value = (a%2==0) ? "even": "odd";
		System.out.println(value);
		

	}

}
