package com.example.myfirstpackage;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 8;

		switch (day) {
		case 1: {
			System.out.println("sunday");
			break;		//unintentional fall-through
		}
		case 2: {
			System.out.println("monday");
			break;
		}
		case 3: {
			System.out.println("tuesday");
			break;
		}
		case 4: {
			System.out.println("wednesday");
			break;
		}
		case 5: {
			System.out.println("thursday");
			break;
		}
		case 6: {
			System.out.println("friday");
			break;
		}
		case 7:{
			System.out.println("saturday");
			;
		}
		default:{
			System.out.println("enter number out of weeks");
		}
		
		int daynum = 3;

        String result = switch (daynum) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(result); 


		}

	}

}
