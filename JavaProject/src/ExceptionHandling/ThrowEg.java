package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowEg {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("nonexistentfile.txt");
        Scanner reader = new Scanner(file);  // This may throw FileNotFoundException
    }
    

    public static void main(String[] args) {
        try {
            checkAge(16);  
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

