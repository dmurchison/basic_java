package Java_Intro._5_.inheritance.protected_vars;

public class Restaurant extends Business {
    protected int rating;

    public void displayRestaurant() {
        // Attempted accesses
        printMembers();             // OK
        name = "Gyro Hero";         // OK    ("protected" above made this possible)
        address = "5 Fifth St";    // OK   ("protected" above made this possible)
    }

    // Other class members ...
}
