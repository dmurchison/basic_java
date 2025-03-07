package Java_Intro._1_.int_div_and_mod;
import java.util.Scanner;


public class TimeConverter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userMinutes; // User input: Minutes
        int outHours;    // Output hours
        int outMinutes;  // Output minutes (remaining)

        System.out.print("Enter minutes: ");
        userMinutes = scnr.nextInt();

        outHours   = userMinutes / 60;
        outMinutes = userMinutes % 60;

        System.out.print(userMinutes  + " minutes is ");
        System.out.print(outHours     + " hours and ");
        System.out.println(outMinutes + " minutes.");

        scnr.close();
    }
}
