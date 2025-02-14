package Java_Intro._5_.z_labs.lab_4;


public class Course {
    // Declare private fields - courseNumber, courseTitle
    private String courseNumber, courseTitle;

    // Define mutator methods -
    //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    // Define accessor methods -
    //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    // Define printInfo()
    public void printInfo() {
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Course Title: " + courseTitle);
    }
}
