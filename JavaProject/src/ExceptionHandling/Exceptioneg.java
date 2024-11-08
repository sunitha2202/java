package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptioneg {
	int i=10/0;

	public static void main(String[] args) {
		 try {
	            int[] arr = {1, 2, 3};
	            System.out.println(arr[3]);  
	        } catch (Exception e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }finally {
	            System.out.println("This will always execute.");
	        }
	}

}
