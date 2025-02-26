package Java_Intro._6_.labwork;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


public class Lab2 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName;
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        // Read the name of the text file
        fileName = scnr.nextLine();

        // Try to open the file
        fileByteStream = new FileInputStream(fileName);
        inFS = new Scanner(fileByteStream);

        // Read and process each line in the file
        while (inFS.hasNextLine()) {
            String photoFileName = inFS.nextLine();
            String infoFileName = photoFileName.replace("_photo.jpg", "_info.txt");
            System.out.println(infoFileName);
        }
    }
}
