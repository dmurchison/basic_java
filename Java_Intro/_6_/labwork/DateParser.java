package Java_Intro._6_.labwork;
import java.util.Scanner;


public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

      // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }
        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        while (true) {
            input = scnr.nextLine();
            if (input.equals("-1")) {
                break;
            }

            // Check if the input contains a comma
            if (input.contains(",")) {
                // Split the input into parts
                String[] parts = input.split(" ");
                if (parts.length == 3) {
                    String monthString = parts[0];
                    String dayString = parts[1].replace(",", "");
                    String yearString = parts[2];

                    try {
                        int month = getMonthAsInt(monthString);
                        int day = Integer.parseInt(dayString);
                        int year = Integer.parseInt(yearString);

                        if (month != 0) {
                            System.out.println(month + "/" + day + "/" + year);
                        }
                    } catch (NumberFormatException e) {
                        // Ignore invalid numbers
                    }
                }
            }
        }
        scnr.close();
    }
}
