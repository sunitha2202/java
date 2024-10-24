package com.example.myfirstpackage;

public class Forloop {

	public static void main(String[] args) {
		//known iteration
		for (int i = 0; i <= 5; i++) {
			System.out.println("i is" + i);
		}
		// check even numbers
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		//odd numbers
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		//sum of numbers
		int n=5;
		 int sum=0;
		for(int i=0; i<=n; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
		//reverse counting from 10 to 0
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		//multiplication table
		int num =5;
		for(int i=1; i<=10;i++) {
			System.out.println(num +"x" + i + "="+( num*i));
		}
		
		// nested for loop
		
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// reverse patern
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 int num1 = 2;
	        for( int i=1; i<=10; i++){
	            System.out.println(num1 + "x" + i +"="+ (num1*i));
	        }

	}

}
