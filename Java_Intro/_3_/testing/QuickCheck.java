package Java_Intro._3_.testing;
import java.util.Scanner;


public class QuickCheck {
    public static void printSelectedNumbers(int numCount) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int number;

        for (i = 0; i < numCount; ++i) {
            number = scnr.nextInt();
            if (number >= 10) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int numCount = 6;

        printSelectedNumbers(numCount);
    }

}
