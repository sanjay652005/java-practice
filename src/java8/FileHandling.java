package java8;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("day22.txt");
	            writer.write("Name: Sanjay\nProject: SkillSwap");
	            writer.close();
	            System.out.println("File created and written successfully");
	        } catch (IOException e) {
	            System.out.println("Error occurred");
	            e.printStackTrace();
	        }
	    }
}
