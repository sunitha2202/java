package ExceptionHandling;

//Define custom exception
class CustomEg1 extends Exception {
 public CustomEg1(String message) {
     super(message);
 }
}

//Use custom exception
public class CustomEg {
 public static void validate(int number) throws CustomEg1 {
     if (number < 0) {
         throw new CustomEg1("Number must be positive.");
     }
 }

 public static void main(String[] args) {
     try {
         validate(-9);  // This will throw CustomException
         System.out.println("entered value is positive integer");
     } catch (CustomEg1 e) {
         System.out.println("Caught custom exception: " + e.getMessage());
     }
 }
}

