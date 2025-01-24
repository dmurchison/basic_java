package Java_Intro._2_.methods;


public class PizzaArea {
    public static double calcPizzaArea() {
        double pizzaDiameter;
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        pizzaDiameter = 12.0;
        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        return pizzaArea;
    }

    public static void main(String[] args) {
        System.out.println("12 inch pizza is " + calcPizzaArea() + " inches squared");
    }
}
