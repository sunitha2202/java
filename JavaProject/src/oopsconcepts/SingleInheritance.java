package oopsconcepts;

public class SingleInheritance {
		//superclass
		void eat() {
			System.out.println("food");
		}
	}
	class Dog extends SingleInheritance{
		void Sound() {
			System.out.println("barks");
		}
	

	public static void main(String[] args) {
		Dog animal = new Dog();
		animal.Sound();

	}

}
