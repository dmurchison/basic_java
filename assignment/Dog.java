package assignment;
import java.util.Scanner;


public class Dog {
    private int dogSpceNumber;
    private int dogWeight;
    private boolean grooming;

    // default constructor
    public Dog() {
        this.dogSpceNumber = -1;
        this.dogWeight = -1;
        this.grooming = false;
    }

    // parameterized constructor
    public Dog(int dogSpceNumber, int dogWeight, boolean grooming) {
        this.dogSpceNumber = dogSpceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // getters and setters
    public int getDogSpaceNumber() {
        return dogSpceNumber;
    }
    public void setDogSpaceNumber(int dogSpceNumber) {
        this.dogSpceNumber = dogSpceNumber;
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
        return "Dog [dogSpceNumber=" + dogSpceNumber + ", dogWeight=" + dogWeight + ", grooming=" + grooming + "]";
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
