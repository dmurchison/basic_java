package Java_Intro._3_.comparisons;

public class CompareFloats {

    public static void main(String[] args) {
        double x = 1.243;
        System.out.println(Math.abs(x - 1.243) < 0.0001); // This is basically the same as x == 1.243, when comparing floats or doubles we should always use this approach
    }
}
