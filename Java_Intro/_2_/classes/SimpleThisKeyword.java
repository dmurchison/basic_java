package Java_Intro._2_.classes;

public class SimpleThisKeyword {
    public static void main(String [] args) {
        ElapsedTime travTime = new ElapsedTime();
        int usrHrs;
        int usrMins;

        usrHrs = 5;
        usrMins = 34;

        travTime.setTime(usrHrs, usrMins);
    }
}
