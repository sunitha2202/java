package com.example.myfirstpackage;


//	 enum Day{
//		sunday,monday,tuesday
//	}
//public class ExampleClass{
//	public static void main(String[] args) {
//		Day today = Day.sunday;
//		System.out.println(today);
//
//	}
//
//}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class ExampleClass() {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}

