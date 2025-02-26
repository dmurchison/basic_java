package Java_Intro._6_.labwork;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String fileName;
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        // Read the name of the CSV file
        System.out.print("Enter the name of the input file: ");
        fileName = scnr.nextLine();

        try {
            // Try to open the file
            fileByteStream = new FileInputStream(fileName);
            inFS = new Scanner(fileByteStream);

            // Data structure to store movie data
            String[][] movieData = new String[100][3]; // Assuming a maximum of 100 movies
            int rowCount = 0;

            // Read and process each line in the file
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    movieData[rowCount][0] = parts[0].trim(); // Showtime
                    movieData[rowCount][1] = parts[1].trim(); // Title
                    movieData[rowCount][2] = parts[2].trim(); // Rating
                    rowCount++;
                }
            }

            // Output the movie data in the specified format
            int i = 0;
            while (i < rowCount) {
                String title = movieData[i][1];
                String rating = movieData[i][2];
                StringBuilder showtimes = new StringBuilder(movieData[i][0]);

                // Collect all showtimes for the same movie
                int j = i + 1;
                while (j < rowCount && movieData[j][1].equals(title)) {
                    showtimes.append(" ").append(movieData[j][0]);
                    j++;
                }

                // Format the output
                String truncatedTitle = title.length() > 44 ? title.substring(0, 44) : title;
                System.out.printf("%-44s | %5s | %s\n", truncatedTitle, rating, showtimes.toString());

                // Move to the next movie
                i = j;
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
