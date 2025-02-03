package Java_Intro._3_.comparisons;
import java.util.Scanner;

public class OrderStrings {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String firstString;
        String secondString;

        firstString  = scnr.next();
        secondString = scnr.next();

        for (int i = 0; i < firstString.length() && i < secondString.length(); i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                continue;
            } else if (firstString.charAt(i) < secondString.charAt(i)) {
                System.out.println(firstString + " " + secondString);
                return;
            } else {
                System.out.println(secondString + " " + firstString);
                return;
            }
        }

        // If all characters are the same up to the length of the shorter string
        if (firstString.length() < secondString.length()) {
            System.out.println(firstString + " " + secondString);
        } else {
            System.out.println(secondString + " " + firstString);
        }
    }
}
