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
        double milesPerGallon = 0.0;
        double dollarsPerGallon = 0.0;
        double milesDriven = 0.0;

        milesPerGallon = scnr.nextDouble();
        dollarsPerGallon = scnr.nextDouble();
        milesDriven = scnr.nextDouble();


        // call drivingCost method and print result
        LabProgram lp = new LabProgram();
        System.out.printf("%.2f\n", lp.drivingCost(milesPerGallon, dollarsPerGallon, milesDriven));
    }
}
