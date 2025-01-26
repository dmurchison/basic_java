package Java_Intro._2_.methods;

public class Method_101 {
    public static void howMethodsWork(String word, String otherWord) {
        System.out.println("The best word is: " + word);
        System.out.println("The second best word is: " + otherWord);
    }

    public static void main(String[] args) {
        howMethodsWork("Java", "Python");
    }
}
