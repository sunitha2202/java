package oopsconcepts;

//Interface with an abstract method
interface Person {
 void sound();  // abstract method 
}

class Man implements Person {
 public void sound() {
     System.out.println("Man called");
 }
}

class Women implements Person {
 public void sound() {
     System.out.println("Women Called");
 }
}
public class AbstractionEg {

 public static void main(String[] args) {
     Person obj1 = new Man();  // Using Animal interface reference
     Person obj2 = new Women();

     // Calls the implemented methods in Dog and Cat classes
     obj1.sound();
     obj2.sound();
 }}






	
