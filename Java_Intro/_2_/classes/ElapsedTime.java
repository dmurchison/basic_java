package Java_Intro._2_.classes;

public class ElapsedTime {
    private int hours;
    private int minutes;

    public ElapsedTime() {
        hours = 0;
        minutes = 0;
    }

    public void setTime(int timeHr, int timeMin) {
        this.hours = timeHr;
        this.minutes = timeMin;
    }
}
