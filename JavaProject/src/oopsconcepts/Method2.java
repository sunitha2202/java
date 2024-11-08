package oopsconcepts;
 class Bank{
	int roi() {
		return 8;
	}
	class Sbi extends Bank{
		int roi() {
			return 10;
		}
	}
	class Icici extends Bank{
		int roi() {
			return 7;
		}
	}
}

public class Method2 {

	public static void main(String[] args) {
		Sbi sbank = new Sbi();
        System.out.println(sbank.roi());

	}

}
