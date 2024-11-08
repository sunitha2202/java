package com.example.myfirstpackage;


	/* static nested class
	 * class Outer{ static class StaticMethod{ void Display() {
	 * System.out.println("Static nested class"); } }
	 */
	class NestedClass{
		private String message="hello";
		class InnerClass{
			public void displayMessage() {
				System.out.println(message);
			}
		}
		
	
	public static void main(String[] args) {
		NestedClass outer = new NestedClass();		//first creating object for first class
		NestedClass.InnerClass inner = outer.new InnerClass(); 	//using object creating instance of inner class
		inner.displayMessage();
		
		

}
}