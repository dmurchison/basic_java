package Java_Intro._5_.polymorphism;
import java.util.ArrayList;


public class CallWatch {
    public static void main(String[] args) {
        Watch watch1;
        Watch watch2;
        SmartWatch watch3;

        ArrayList<Watch> watchList = new ArrayList<Watch>();
        int i;

        watch1 = new Watch();
        watch1.setHours(10);
        watch1.setMins(22);

        watch2 = new Watch();
        watch2.setHours(20);
        watch2.setMins(44);

        watch3 = new SmartWatch();
        watch3.setHours(3);
        watch3.setMins(25);
        watch3.setPercentage(73);

        watchList.add(watch3);
        watchList.add(watch2);
        watchList.add(watch1);

        for(i = 0; i < watchList.size(); ++i) {
            watchList.get(i).printItem();
        }
    }
}
