package Java_Intro._3_;
import java.util.Scanner;


public class YearChecker {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int givenYear;

        givenYear = scnr.nextInt();

        if (givenYear < 1752) {
            System.out.println("Not in the Gregorian calendar");
        } else if ((givenYear % 4 == 0) && ((givenYear % 100 != 0) || (givenYear % 400 == 0))) {
            System.out.println("Leap year");
        } else {
            System.out.println("Common year");
        }
    }
}
