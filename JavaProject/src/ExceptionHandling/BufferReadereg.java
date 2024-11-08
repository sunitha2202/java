package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferReadereg {

		
		    public static void main(String[] args) {
		        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
		            String s = null;
		            while (s!=null) 
		            		{  
		                System.out.println(s);
		                System.out.println("success");

		            }
		        } catch (IOException e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        }
		    


	}

}
