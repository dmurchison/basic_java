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

        // Print the current working directory
        String currentDir = Paths.get("").toAbsolutePath().toString();
        System.out.println("Current working directory: " + currentDir);

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

            // Read and process each line in the input file
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine();
                outFS.println(line);
            }

            System.out.println("Content has been transferred to " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (inFS != null) {
                inFS.close();
            }
            if (outFS != null) {
                outFS.close();
            }
            if (fileByteStream != null) {
                fileByteStream.close();
            }
            if (fileByteStream2 != null) {
                fileByteStream2.close();
            }
        }
    }
}
