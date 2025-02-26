package Java_Intro._6_.labwork;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName;
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        // Read the name of the text file
        System.out.print("Enter the name of the input file: ");
        fileName = scnr.nextLine();

        try {
            // Try to open the file
            fileByteStream = new FileInputStream(fileName);
            inFS = new Scanner(fileByteStream);

            // Arrays to store the information
            ArrayList<String> categories = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> descriptions = new ArrayList<>();
            ArrayList<String> availabilities = new ArrayList<>();
            int count = 0;

            // Read and process each line in the file
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine();
                String[] parts = line.split("\\s{2,}|\\t");

                // Check if the line contains the expected number of parts
                if (parts.length == 4) {
                    categories.add(parts[0]);
                    names.add(parts[1]);
                    descriptions.add(parts[2]);
                    availabilities.add(parts[3]);
                    count++;
                }
            }

            // print all of the arrays
            System.out.println("Categories: " + categories);
            System.out.println("Names: " + names);
            System.out.println("Descriptions: " + descriptions);
            System.out.println("Availabilities: " + availabilities);
            System.out.println("Count: " + count);
            System.out.println("--------------------------------------------------");

            // Print the parts of the food items
            for (int i = 0; i < count; i++) {
                System.out.println("Category: " + categories.get(i));
                System.out.println("Name: " + names.get(i));
                System.out.println("Description: " + descriptions.get(i));
                System.out.println("Availability: " + availabilities.get(i));
                System.out.println();
            }
            System.out.println("--------------------------------------------------");

            // Output the available food items
            for (int i = 0; i < count; i++) {
                if (availabilities.get(i).equals("Available")) {
                    System.out.println(names.get(i) + " (" + categories.get(i) + ") -- " + descriptions.get(i));
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
