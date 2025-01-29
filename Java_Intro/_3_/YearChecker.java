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

        // using a switch statement
        switch (givenYear) {
            case 1752:
                System.out.println("Special year");
                break;
            case 1800:
                System.out.println("Special year");
                break;
            case 1900:
                System.out.println("Special year");
                break;
            case 2100:
                System.out.println("Special year");
                break;
            case 2200:
                System.out.println("Special year");
                break;
            case 2300:
                System.out.println("Special year");
                break;
            case 2500:
                System.out.println("Special year");
                break;
            default:
                System.out.println("Not a special year");
                break;
        }
    }
}
