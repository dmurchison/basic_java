package Java_Intro._2_.methods;

public class PizzaArea {
    public static double calcPizzaArea() {
        double pizzaDiameter = 12.0;
        double pizzaRadius = pizzaDiameter / 2.0;
        double pizzaArea = Math.PI * Math.pow(pizzaRadius, 2.0);

        return pizzaArea;
    }

    public static void main(String[] args) {
        System.out.println("Pizza area: " + calcPizzaArea());
    }
}
