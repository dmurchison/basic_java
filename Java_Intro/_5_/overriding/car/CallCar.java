package Java_Intro._5_.overriding.car;


public class CallCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        ElectricCar electricCar = new ElectricCar();

        myCar.setBrand("Chevrolet");
        myCar.setModel("Malibu");
        electricCar.setBrand("Tesla");
        electricCar.setModel("Model X");
        electricCar.setRange("315 miles");

        System.out.println(myCar);
        System.out.println(electricCar);
    }
}
