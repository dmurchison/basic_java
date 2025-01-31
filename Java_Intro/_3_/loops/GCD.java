package Java_Intro._3_.loops;
import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA;
        int numB;

        System.out.println("Enter the first number: ");
        numA = sc.nextInt();

        System.out.println("Enter the second number: ");
        numB = sc.nextInt();

        while (numA != numB) {
            if (numB > numA) {
                numB = numB - numA;
            } else {
                numA = numA - numB;
            }
        }

        System.out.println("GCD is: " + numA);
    }
}
