package Java_Intro._1_;

import java.util.Scanner;

public class SphereVolCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double sphereVolume;
        double sphereRadius;

        sphereRadius = scnr.nextDouble();

        /* Your solution goes here  */
        sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);

        System.out.printf("%.2f\n", sphereVolume);

        scnr.close();
    }
}
