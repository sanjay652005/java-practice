package java8;
import java.io.*;
import java.util.Scanner;

public class NotesManager {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            try {
                if (choice == 1) {
                    System.out.print("Enter your note: ");
                    String note = sc.nextLine();

                    FileWriter writer = new FileWriter("notes.txt", true);
                    writer.write(note + "\n");
                    writer.close();

                    System.out.println("✅ Note saved!");

                } else if (choice == 2) {
                    BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
                    String line;

                    System.out.println("\n📂 Your Notes:");
                    while ((line = reader.readLine()) != null) {
                        System.out.println("- " + line);
                    }
                    reader.close();

                } else if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
