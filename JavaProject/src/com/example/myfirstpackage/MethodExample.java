package com.example.myfirstpackage;

public class MethodExample {
	public void sayHello() {	//no parameter
		System.out.println("Hello Method");
	}
	public int add(int a, int b) { 	//with parameter
		return a+ b;
	}
	public String add(String  name) {
		return name;
	}

	public static void main(String[] args) {
		MethodExample hm = new MethodExample();
		hm.sayHello();
		//MethodExample sums = new MethodExample();
		int sum = hm.add(3, 5);
		System.out.println(sum);
		String value = hm.add("sunitha");
		System.out.println(value);
		

	}

}
