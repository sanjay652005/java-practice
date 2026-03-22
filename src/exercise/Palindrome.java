package exercise;
import java.util.Scanner;

public class Palindrome {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a word: ");
	        String word = sc.nextLine();

	        String rev = "";

	        for(int i = word.length() - 1; i >= 0; i--){
	            rev = rev + word.charAt(i);
	        }

	        if(word.equals(rev))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
	
}
