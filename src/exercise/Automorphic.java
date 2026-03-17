package exercise;
import java.util.Scanner;
public class Automorphic {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = num * num;

        if(square % 10 == num % 10)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}
