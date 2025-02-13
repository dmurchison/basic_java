package Java_Intro._5_.overriding;


public class Business {
    protected String name;    // Member accessible by self and derived classes
    protected String address;   // Member accessible only by self

    public void setName(String busName) {
        name = busName;
    }

    public void setAddress(String busAddress) {
        address = busAddress;
    }

    public void printMembers() { // Member accessible by anyone
        // Print information ...
    }

    public String getDescription() {
        return name + " -- " + address;
    }
}
