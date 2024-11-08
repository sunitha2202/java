package oopsconcepts;

public class Employee {
	private String name;
	
public String  getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public static class Company{
	public void Display() {
	Employee emp= new Employee();
	emp.setName("arun");
	System.out.println(emp.getName());
}
}
	public static void main(String[] args) {
		Company cmp = new Company();
		cmp.Display();


	}

}
