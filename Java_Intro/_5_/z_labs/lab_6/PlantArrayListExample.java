package Java_Intro._5_.z_labs.lab_6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class PlantArrayListExample {
    // Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden){
        for(Plant plant : myGarden){
            plant.printInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        // Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        // Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
        String plantName, colorOfFlowers, plantCost;
        boolean isAnnual;

        input = scnr.next();
        while(!input.equals("-1")){
            // Check if input is a plant or flower
            if (input.equals("plant")) {
                //       Store as a plant object or flower object
                Plant plant = new Plant();
                plantName = scnr.next();
                plantCost = scnr.next();
                plant.setPlantName(plantName);
                plant.setPlantCost(plantCost);
                myGarden.add(plant);
                //       Add to the ArrayList myGarden
            } else if (input.equals("flower")) {
                Flower flower = new Flower();
                plantName = scnr.next();
                plantCost = scnr.next();
                isAnnual = scnr.nextBoolean();
                colorOfFlowers = scnr.next();
                flower.setPlantName(plantName);
                flower.setPlantCost(plantCost);
                flower.setPlantType(isAnnual);
                flower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(flower);
            }
            input = scnr.next();
        }
        // Call the method printArrayList to print myGarden
        printArrayList(myGarden);
    }
}

