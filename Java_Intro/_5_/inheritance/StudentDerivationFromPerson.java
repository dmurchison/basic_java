package Java_Intro._5_.inheritance;


public class StudentDerivationFromPerson {
    public static void main(String[] args) {
        Student courseStudent = new Student();

        courseStudent.setName("Smith");
        courseStudent.setAge(20);
        courseStudent.setIdNum(9999);
        courseStudent.printAll();
        System.out.println(", ID: " + courseStudent.getIdNum());
    }
}
