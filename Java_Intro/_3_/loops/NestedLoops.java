package Java_Intro._3_.loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();
        /* Your solution goes here  */
        for (i = 0; i <= userNum; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }


        
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        /* Your solution goes here  */
        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                // We have to subtract 1 because when initializing the loop, we increment BEFORE each iteration,
                // if we put the ++ after the variable, it will increment AFTER each iteration.
                currentColumnLetter = (char)('A' + currentColumn - 1);
                System.out.print(currentRow);
                System.out.print(currentColumnLetter);
                System.out.print(" ");
            }
        }

        System.out.println("");
    }
}
