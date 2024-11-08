package com.example.myfirstpackage;

class Car{
	String brand;
	int year;
	Car(String b, int y){
		this.brand =b; // reference to the current object within the instance 
		this.year = y;
	}
}

public class DataTypes {

	public static void main(String[] args) {
		// primitive datatypes
		byte age=25;
		int salary = 20000;
		float pi = 3.14f;
		double percentage = 68.6;
		char grade ='A';
		boolean isDay =true;
		
		
		System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Pi: " + pi);
        System.out.println("percentage" +percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Is now day " + isDay);
        //non-primitive or reference datatype
        
        //string 
        String name ="sunitha";
        System.out.println("my name is " + name);
        
        //array
        int[] numbers= {1,2,3,4,5};
        System.out.println(numbers[4]);
        //class and objects
        car myCar = new car("Toyoto" ,2004);
        System.out.println("car brand " +   myCar.brand);
        System.out.println("year" + myCar.year);
        

	}

}
