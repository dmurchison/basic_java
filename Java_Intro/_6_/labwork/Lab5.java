package Java_Intro._6_.labwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int NUM_CHARACTERS = 26;      // Maximum number of letters
        int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

        String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
        String[] words = new String[MAX_WORDS]; // The words of each input line

        /* Type your code here. */
        // Read the word and letter from the user
        System.out.print("Enter the word: ");
        String word = scnr.nextLine();
        System.out.print("Enter the letter: ");
        char letter = scnr.nextLine().charAt(0);

        // Open the text file associated with the input word
        String fileName = word + ".txt";
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        try {
            fileByteStream = new FileInputStream(fileName);
            inFS = new Scanner(fileByteStream);

            // Store the contents of the text file into the 2D array
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine();
                String[] parts = line.split(" ");
                if (parts.length > 0) {
                    char firstChar = parts[0].charAt(0);
                    int index = firstChar - 'a';
                    for (int i = 0; i < parts.length; i++) {
                        synonyms[index][i] = parts[i];
                    }
                }
            }

            // Search the array and output all the synonyms that begin with the input letter
            int searchIndex = letter - 'a';
            boolean found = false;
            for (int i = 0; i < MAX_WORDS; i++) {
                if (synonyms[searchIndex][i] != null) {
                    System.out.println(synonyms[searchIndex][i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No synonyms for " + word + " begin with " + letter + ".");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (inFS != null) {
                inFS.close();
            }
            if (fileByteStream != null) {
                try {
                    fileByteStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
