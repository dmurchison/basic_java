package Java_Intro._2_.classes;


public class SimpleThisKeyword {
    public static void main(String [] args) {
        ElapsedTime travTime = new ElapsedTime();

        int usrHrs;
        int usrMins;

        usrHrs = 5;
        usrMins = 34;

        travTime.setTime(usrHrs, usrMins); // Calls the setTime method
        travTime.print();

        ElapsedTime travTime2 = new ElapsedTime(3, 45); // Calls the overloaded constructor
        travTime2.print();

        ElapsedTime travTime3 = new ElapsedTime(); // Calls the default constructor
        travTime3.print();
    }
}
