package java8;
import java.io.File;
import java.util.Scanner;

public class ReadFile {
	 public static void main(String[] args) {
	        try {
	            File file = new File("day22.txt");
	            Scanner sc = new Scanner(file);

	            while (sc.hasNextLine()) {
	                System.out.println(sc.nextLine());
	            }

	            sc.close();
	        } catch (Exception e) {
	            System.out.println("Error reading file");
	            e.printStackTrace();
	        }
	    }

}
