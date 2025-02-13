package Java_Intro._5_.inheritance.protected_vars;

public class InheritanceAccessEx {
    public static void main(String[] args) {
        Business business = new Business();
        Restaurant restaurant = new Restaurant();

        // Attempted accesses
        business.printMembers();          // OK
        business.name = "Gyro Hero";      // OK (protected also applies to other classes in the same package)
        business.address = "5 Fifth St";  // ERROR

        restaurant.printMembers();        // OK
        restaurant.name = "Gyro Hero";    // OK (protected also applies to other classes in the same package)
        restaurant.rating = 5; // ERROR

        // Other instructions ...
    }
}
