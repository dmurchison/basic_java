public class CostCalculator {
    public static int calculateCost(int age, int units) {
        int cost;
        if (age > 17 && age <= 29) {
            if (units > 13) {
                cost = (units - 13) * 200;
            }
            else {
                cost = 0;
            }
        }
        else {
            if (units < 11) {
                cost = units * 200;
            }
            else {
                cost = (units - 10) * 500 + 300;
            }
        }
        return cost;
        }

        public static void main(String[] args) {
        int costReturned = calculateCost(15, 20);
        System.out.println(costReturned);
        }
}
