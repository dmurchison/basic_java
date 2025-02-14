package Java_Intro._5_.z_labs.lab_4;


public class OfferedCourse extends Course {
    // Declare private fields - instructorName, term, classTime
    private String instructorName, term, classTime;

    // Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    // Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()
    public String getInstructorName() {
        return instructorName;
    }

    public String getTerm() {
        return term;
    }

    public String getClassTime() {
        return classTime;
    }
}
