package Java_Intro._6_;

public class OutputFormatting {
    public static void main(String[] args) {
        // Declare variables
        double myFloat = 1.23456789;
        int myInt = 123456789;
        String myString = "Hello,";

        // Use the width specifier to specify the minimum number of characters to print
        System.out.printf("%10.2f \n", myFloat); // in this the 10 is the width specifier and the 2 is the precision specifier
        System.out.printf("%d %n", myInt);
        System.out.printf("%10s %n", myString); // in this the 10 is the width specifier, meaning the minimum number of characters to print

        // Width specifier
        System.out.printf("Value: %7.2f \n", myFloat);
    }
}
