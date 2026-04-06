package java8;

import java.io.*;
import java.util.Scanner;

public class LoggerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Logger Menu ---");
            System.out.println("1. Add Log");
            System.out.println("2. View Logs");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addLog(sc);
                    break;
                case 2:
                    viewLogs();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    // Add log to file
    public static void addLog(Scanner sc) {
        try {
            System.out.print("Enter log message: ");
            String message = sc.nextLine();

            FileWriter fw = new FileWriter("logs.txt", true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(message);
            bw.newLine();

            bw.close();

            System.out.println("Log saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // View logs from file
    public static void viewLogs() {
        try {
            FileReader fr = new FileReader("logs.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n--- Logs ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
