package Java_Intro.assignment;
import java.util.Scanner;


public class Dog {
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;

    // default constructor
    public Dog() {
        this.dogSpaceNumber = -1;
        this.dogWeight = -1;
        this.grooming = false;
    }

    // parameterized constructor
    public Dog(int dogSpaceNumber, int dogWeight, boolean grooming) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // getters and setters
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }
    public int getDogWeight() {
        return dogWeight;
    }
    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }
    public boolean getGrooming() {
        return grooming;
    }
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }

    // toString method
    public String toString() {
        return "Dog [dogSpaceNumber=" + dogSpaceNumber + ", dogWeight=" + dogWeight + ", grooming=" + grooming + "]";
    }

    public static void main(String[] args) {
        // get input
        System.out.println("Enter dog space number, weight, and grooming status: ");
        Scanner scnr = new Scanner(System.in);
        int dogSpaceNumber = scnr.nextInt();
        int dogWeight = scnr.nextInt();
        boolean grooming = scnr.nextBoolean();
        Dog doggyInput = new Dog(dogSpaceNumber, dogWeight, grooming); // parameterized constructor
        System.out.println(doggyInput.toString());

        // call default constructor
        Dog doggyDefault = new Dog(); // default constructor
        System.out.println(doggyDefault.toString());

        doggyDefault.setDogSpaceNumber(15);
        doggyDefault.setDogWeight(50);
        doggyDefault.setGrooming(true);
        System.out.println(doggyDefault.toString());
    }
}
