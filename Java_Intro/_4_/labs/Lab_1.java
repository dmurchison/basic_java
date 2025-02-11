package Java_Intro._4_.labs;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int DIFF_WEIGHTS = 5;
        double[] weights = new double[DIFF_WEIGHTS];
        int i;

        for (i = 0; i < DIFF_WEIGHTS; ++i) {
            System.out.print("Enter weight " + (i + 1) + ": ");
            weights[i] = scnr.nextDouble(); // Read input as double
        }

        System.out.println("You entered: ");
        for (i = 0; i < DIFF_WEIGHTS - 1; ++i) {
            System.out.print(weights[i] + " ");
        }
        System.out.println(weights[weights.length - 1]);

        // Total weight
        double totalWeight = 0;
        for (i = 0; i < DIFF_WEIGHTS; ++i) {
            totalWeight += weights[i];
        }
        System.out.println("Total weight: " + totalWeight);
        // Average weight
        double averageWeight = totalWeight / DIFF_WEIGHTS;
        System.out.println("Average weight: " + averageWeight);
        // Maximum weight
        double maxWeight = weights[0];
        for (i = 1; i < DIFF_WEIGHTS; ++i) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }
        System.out.println("Maximum weight: " + maxWeight);
    }
}
