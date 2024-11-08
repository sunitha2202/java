package com.example.myfirstpackage;

public class ArrayExample {

	public static void main(String[] args) {
		int[] marks = {65,67,78,87,98};
		for(int i=0; i< marks.length; i++) {
			System.out.println(marks[i]);
		}
//multidimentional array
		int num[][] = {{1,2,3},
						{2,3,4},
						{3,4,5}};
		
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++){
				System.out.print(num[i][j] +" ");
			}
				System.out.println();
			}
		
		}
	}


