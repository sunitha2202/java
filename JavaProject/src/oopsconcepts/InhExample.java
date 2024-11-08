package oopsconcepts;

class Animal{
	void Eat() {
		System.out.println("eating");
	}
}
 class Cat extends Animal{
	void Sound() {
		System.out.println("barking");
	}
} 
public class InhExample { 

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Eat();
		cat.Sound();
	}

	
	


}
