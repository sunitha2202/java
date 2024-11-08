package oopsconcepts;

class SampleChecking {
	  int marks ;
	 String name;
	
	
	 void Display1(int marks, String name) {
		this.marks = marks;
		this.name=name;
		System.out.println("my name is" + name +" " + "my mark is" +" " + marks);
	}

	
	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		SampleChecking value = new SampleChecking();
		value.Display1(90, "arun");
		
		
		
		

	}


	

}
