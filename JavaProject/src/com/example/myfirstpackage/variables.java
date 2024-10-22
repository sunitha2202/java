
package com.example.myfirstpackage;
import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
	//	int a= 10;
		//int b= 20;
		//int c= a+b;
		//System.out.println(c);
		
		Scanner obj = new Scanner(System.in);	//get user input from the console
		int a= obj.nextInt();	//read next integer value from the user
		int b= obj.nextInt();
		String name=obj.nextLine();
		//System.out.println(a+b);
		System.out.println(name);

	}
}
