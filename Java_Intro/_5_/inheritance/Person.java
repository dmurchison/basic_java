package Java_Intro._5_.inheritance;


public class Person {
    private int ageYears;
    private String lastName;

    public void setName(String userName) {
        lastName  = userName;
    }

    public void setAge(int numYears) {
        ageYears = numYears;
    }

    public void printAll() {
        System.out.print("Name: " + lastName);
        System.out.print(", Age: "  + ageYears);
    }
}
