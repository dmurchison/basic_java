package Java_Intro._2_.lab;
import java.util.Scanner;


public class LabProgram {
    public double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        double costToDrive = 0.0;

        costToDrive = milesDriven / milesPerGallon * dollarsPerGallon;

        return costToDrive;
    }

    public static void main(String[] args) {
        // get input
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon = scnr.nextDouble();
        double dollarsPerGallon = scnr.nextDouble();


        // call drivingCost method and print result
        LabProgram lp = new LabProgram();
        System.out.printf("%.2f ", lp.drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
        System.out.printf("%.2f ", lp.drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
        System.out.printf("%.2f\n", lp.drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
    }
}
