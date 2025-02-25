package Java_Intro._6_.labwork;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Quicky {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double voltageLevel;

        while (scnr.hasNext()) {
            try {
                voltageLevel = scnr.nextDouble();
                if (voltageLevel >= 3.8) {
                    System.out.println("High");
                } else if (voltageLevel >= 0.0 && voltageLevel <= 1.9) {
                    System.out.println("Low");
                } else {
                    System.out.println("-");
                }
            } catch (InputMismatchException excpt) {
                System.out.println("InputMismatchException");
                scnr.next();
            }
        }
    }
}
