package com.example.myfirstpackage;

public class JaggedArray {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		int nums[][] = {{1,2,3},
				{2,4},
				{3,4,5,6,7,6}};
		for(int i = 0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();

		}
// enhance for loop
		for (int number: numbers) {
			System.out.println(number);
		}
		for (int[] row: nums) {
			for(int element:row) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

}
