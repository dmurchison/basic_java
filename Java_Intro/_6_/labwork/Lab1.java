package Java_Intro._6_.labwork;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter input string: ");
            input = scnr.nextLine();

            if (input.equals("q")) {
                break;
            }

            if (!input.contains(",")) {
                System.out.println("Error: No comma in string");
                continue;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Error: Invalid input format");
                continue;
            }

            String firstWord = parts[0].trim();
            String secondWord = parts[1].trim();

            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.println();
        }

        scnr.close();
        return;
    }
}
