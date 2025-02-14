package Java_Intro._5_.inheritance.protected_vars;


public class Business {
    protected String name;    // Member accessible by self and derived classes
    protected String address;   // Member accessible only by self

    public void printMembers() { // Member accessible by anyone
        // Print information ...
    }
}
