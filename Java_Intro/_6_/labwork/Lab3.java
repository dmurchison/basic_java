package Java_Intro._6_.labwork;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.io.IOException;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String inputFileName;
        String outputFileName = "report.txt";
        FileInputStream fileByteStream = null;
        FileOutputStream fileByteStream2 = null;
        Scanner inFS = null;
        PrintWriter outFS = null;

      // Print the current working directory (Very important when doing this in a local IDE)
      //  String currentDir = Paths.get("").toAbsolutePath().toString();
      //  System.out.println("Current working directory: " + currentDir);

        // Read the name of the text file
        System.out.print("Enter the name of the input file: ");
        inputFileName = scnr.nextLine();

        try {
            // Try to open the input file
            fileByteStream = new FileInputStream(inputFileName);
            inFS = new Scanner(fileByteStream);

            // Open the output file
            fileByteStream2 = new FileOutputStream(outputFileName);
            outFS = new PrintWriter(fileByteStream2);

            // Variables to store student information and exam averages
            String lastName, firstName;
            int midterm1, midterm2, finalExam;
            double avgScore;
            char grade;
            int studentCount = 0;
            double totalMidterm1 = 0, totalMidterm2 = 0, totalFinal = 0;

            // Read and process each line in the TSV file
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine();
                String[] parts = line.split("\\s+");
                lastName = parts[0];
                firstName = parts[1];
                midterm1 = Integer.parseInt(parts[2]);
                midterm2 = Integer.parseInt(parts[3]);
                finalExam = Integer.parseInt(parts[4]);

                // Compute the average score
                avgScore = (midterm1 + midterm2 + finalExam) / 3.0;

                // Assign a letter grade based on the average score
                if (avgScore >= 90) {
                    grade = 'A';
                } else if (avgScore >= 80) {
                    grade = 'B';
                } else if (avgScore >= 70) {
                    grade = 'C';
                } else if (avgScore >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                // Print the results to the output file
                outFS.printf("%s\t%s\t%d\t%d\t%d\t%c\n", lastName, firstName, midterm1, midterm2, finalExam, grade);

                // Update the total scores and student count
                totalMidterm1 += midterm1;
                totalMidterm2 += midterm2;
                totalFinal += finalExam;
                studentCount++;
            }

            // Compute the average of each exam
            double avgMidterm1 = totalMidterm1 / studentCount;
            double avgMidterm2 = totalMidterm2 / studentCount;
            double avgFinal = totalFinal / studentCount;

            // Output the exam averages to the report file
            outFS.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", avgMidterm1, avgMidterm2, avgFinal);

            System.out.println("Content has been transferred to " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
