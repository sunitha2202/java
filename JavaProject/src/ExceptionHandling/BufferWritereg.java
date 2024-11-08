package ExceptionHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritereg {

	public static void main(String[] args) {
		

		        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
		            bw.write("Hello, World!");
		            bw.newLine();  
		            bw.write("Buffered writing is efficient.");
		            bw.newLine();
		            System.out.println("success");
		        } catch (IOException e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        }
		    }
		
	}

