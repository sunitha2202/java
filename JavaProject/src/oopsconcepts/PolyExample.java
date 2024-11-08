package oopsconcepts;

class Bird {
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog overrides sound method
class Sparrow extends Bird {
 @Override
 public void sound() {
     System.out.println("Sparrow called");
 }
}

//Subclass Cat overrides sound method
class Owl extends Bird {
 @Override
 public void sound() {
     System.out.println("Owl called");
 }
}





public class PolyExample{
	public static void main(String[] args) {
		 Bird obj1 = new Sparrow(); // Animal reference but Dog object
	     Bird obj2 = new Owl(); // Animal reference but Cat object

	     // Calls the overridden methods in Dog and Cat classes
	     obj1.sound();
	     obj2.sound();

	}

}

