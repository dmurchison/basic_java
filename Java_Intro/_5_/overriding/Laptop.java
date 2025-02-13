package Java_Intro._5_.overriding;

public class Laptop extends Computer {
    // Since this method has a different number of parameters than the method in the parent class, it is not overriding the method in the parent class.
    // It is however, overloading the method in the parent class.
    public void setComputerStatus(String cpuStatus, String internetStatus, String wifiStatus) {
        cpuUsage = cpuStatus;
        internet = internetStatus;
        wifiQuality = wifiStatus;
    }

    @Override
    public void printStatus() {
        super.printStatus(); // This calls the printStatus method in the parent class.
        System.out.println("WiFi: " + wifiQuality);
    }

    private String wifiQuality;
}
