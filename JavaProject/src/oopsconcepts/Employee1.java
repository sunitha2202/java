package oopsconcepts;
import oopsconcepts.Encapsulationconcept;

public class Employee1 {
	private Encapsulationconcept emp;
	
	
	public Employee1(){
	emp = new Encapsulationconcept();
	}
	
	public String getName() {
		return emp.getName();
	}
	public void setName(String name) {
		emp.setName(name);
	}
	public static void main(String[] arg) {
		Employee1 emp1 = new Employee1();
		emp1.setName("arun");
		System.out.println(emp1.getName());
		
		
		
	}
}

