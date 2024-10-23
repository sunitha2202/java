package com.example.myfirstpackage;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class ObjectCasting {

	public static void main(String[] args) {
		 Animal animal = new Dog();  // Implicit casting (upcasting)
	        animal.sound();              // Output: Dog barks
	        
	        Dog dog = (Dog) animal;      // Explicit casting (downcasting)
	        dog.sound();                 // Output: Dog barks

	}

}


