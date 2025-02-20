package Java_Intro._6_;

import java.util.Scanner;

public class FlyDrive {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double miles;          // User defined distance
        double hoursFly;       // Time to fly distance
        double hoursDrive;     // Time to drive distance

        // Prompt user for distance
        System.out.print("Enter a distance in miles: ");
        miles = scnr.nextDouble();
        // Calculate the correspond time to fly/drive distance

        hoursFly = miles / 500.0;
        hoursDrive = miles / 60.0;

        // Output resulting values
        System.out.printf("%.2f miles would take:\n", miles);
        System.out.printf("%.2f hours to fly\n", hoursFly);
        System.out.printf("%.2f hours to drive\n", hoursDrive);
    }
}
