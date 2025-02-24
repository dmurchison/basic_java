package Java_Intro._6_.string_input_streams;
import java.util.Scanner;


public class StringInputStream {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner inSS = null;
        String userInput;
        String userMonth = "";
        int userDate = 0;
        int userYear = 0;

        userInput = scnr.nextLine();
        inSS = new Scanner(userInput);

        /* Your solution goes here  */
        if (inSS.hasNext()) { // Check if the input is a string
            userMonth = inSS.next(); // Read the month
        }
        if (inSS.hasNextInt()) { // Check if the input is an integer
            userDate = inSS.nextInt(); // Read the date
        }
        if (inSS.hasNextInt()) { // Check if the input is an integer
            userYear = inSS.nextInt(); // Read the year
        }

        System.out.println("Month: " + userMonth);
        System.out.println("Date: " + userDate);
        System.out.println("Year: " + userYear);
    }
}
