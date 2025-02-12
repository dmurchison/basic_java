package Java_Intro._3_;


public class GradeNormalizer {
    public static int normalizeGrade(int grade) {
        int upperBound = 68;
        int lowerBound = 48;

        if (grade > upperBound) {
            return upperBound;
        }
        else if (grade < lowerBound){
            return lowerBound;
        }
        else {
            return grade;
        }
    }

    public static void main(String[] args) {
        int grade1 = normalizeGrade(54);
        int grade2 = normalizeGrade(15);
        int grade3 = normalizeGrade(90);

        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
    }
}
