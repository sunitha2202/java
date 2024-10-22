package com.example.myfirstpackage;

public class Literals {

	public static void main(String[] args) {
		 // Integer literals
        int decimalNum = 42;             // Decimal
        int hexNum = 0x2A;               // Hexadecimal
        int octalNum = 052;              // Octal
        int binaryNum = 0b101010;        // Binary

        // Floating-point literals
        double pi = 3.14;                // Decimal
        double speedOfLight = 3e8;       // Scientific notation

        // Character literals
        char letter = 'A';
        char digit = '1';
        char specialChar = '$';

        // String literals
        String greeting = "Hello, World!";
        String emptyString = "";          // An empty string

        // Boolean literals
        boolean isDay = true;
        boolean isNight = false;

        // Output
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimalNum);
        System.out.println("Hexadecimal: " + hexNum);
        System.out.println("Octal: " + octalNum);
        System.out.println("Binary: " + binaryNum);

        System.out.println("Floating-Point Literals:");
        System.out.println("Pi: " + pi);
        System.out.println("Speed of Light: " + speedOfLight);

        System.out.println("Character Literals:");
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Special Character: " + specialChar);

        System.out.println("String Literals:");
        System.out.println("Greeting: " + greeting);
        System.out.println("Empty String: '" + emptyString + "'");

        System.out.println("Boolean Literals:");
        System.out.println("Is Day " + isDay);
        System.out.println("Is Night " + isNight);


	}

}
