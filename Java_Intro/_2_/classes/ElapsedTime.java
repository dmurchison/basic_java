package Java_Intro._2_.classes;

public class ElapsedTime {
    private int hours;
    private int minutes;

    // Overloaded constructor definition
    public ElapsedTime(int timeHours, int timeMins) {
        hours   = timeHours;
        minutes = timeMins;
    }

    // Default constructor definition
    public ElapsedTime() {
        this(0, 0);
    }

    public void setTime(int timeHr, int timeMin) {
        this.hours = timeHr;
        this.minutes = timeMin;
    }

    public void print() {
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}
