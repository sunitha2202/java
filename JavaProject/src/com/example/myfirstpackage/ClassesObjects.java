package com.example.myfirstpackage;

public class ClassesObjects {
	
	int english = 89;
	int maths =98;
	int tamil;
	

	public static void main(String[] args) {
		// object: mark and data. a class can have more objects
		ClassesObjects mark = new ClassesObjects();
		
		System.out.println(mark.english);
		
		ClassesObjects data = new ClassesObjects();
		data.tamil = 78;
		
		System.out.println(data.maths);
		System.out.println(data.tamil);

		
		

	}

}
