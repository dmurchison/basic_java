package Java_Intro._3_;
import java.util.Scanner;


public class CheckingPasscodes {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean hasDigit;
      String passCode;

      hasDigit = false;
      passCode = scnr.next();

      /* Your solution goes here  */
      for (int i = 0; i < passCode.length(); i++) {
         if (Character.isDigit(passCode.charAt(i))) {
            hasDigit = true;
         }
      }

      if (hasDigit) {
         System.out.println("Has a digit.");
      }
      else {
         System.out.println("Has no digit.");
      }
   }
}
