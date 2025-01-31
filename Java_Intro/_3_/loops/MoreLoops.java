package Java_Intro._3_.loops;

public class MoreLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i is: " + i);
            i++;
        }
        System.out.println("Final value of i is: " + i);


        for (int j = 0; j < 10; j++) {
            System.out.println("j is: " + j);
        } // Since this is a for loop, j is not available outside of the loop
        System.out.println("The value of j is not available outside the for loop");


        int k = 0;
        do {
            System.out.println("k is: " + k);
            k++;
        } while (k < 10); // This is basically a while loop, but it will always run at least once, even if the condition is false at the start.
        System.out.println("Final value of k is: " + k);
    }

}
