package Java_Intro.assignment;


public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    // default constructor
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.petAge = -1;
        this.dogSpaces = 30;
        this.catSpaces = 12;
        this.daysStay = -1;
        this.amountDue = -1;
    }

    // parameterized constructor
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // getters and setters
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public int getPetAge() {
        return petAge;
    }
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    public int getDogSpaces() {
        return dogSpaces;
    }
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }
    public int getCatSpaces() {
        return catSpaces;
    }
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    // petCheckIn method
    public void petCheckIn(String petType, String petName, int petAge, int daysStay) {
        if (petType.equals("dog")) {
            if (dogSpaces > 0) {
                dogSpaces--;
                this.petType = petType;
                this.petName = petName;
                this.petAge = petAge;
                this.daysStay = daysStay;
                this.amountDue = daysStay * 75.00;
            } else {
                System.out.println("No dog spaces available.");
            }
        } else if (petType.equals("cat")) {
            if (catSpaces > 0) {
                catSpaces--;
                this.petType = petType;
                this.petName = petName;
                this.petAge = petAge;
                this.daysStay = daysStay;
                this.amountDue = daysStay * 40.00;
            } else {
                System.out.println("No cat spaces available.");
            }
        } else {
            System.out.println("Invalid pet type.");
        }
    }
}
