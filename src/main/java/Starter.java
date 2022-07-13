import java.util.List;

public class Starter {

    public static void main(String[] args) {
        int studentsCount = 15;
        List<Student> allStudents = Utils.generateStudents(studentsCount);
        List<Student> studentsWithLetterA = Utils.getStudentsWithLetter(allStudents, Letter.A);
        List<Student> studentsWithLetterB = Utils.getStudentsWithLetter(allStudents, Letter.B);
        List<Student> studentsWithLetterC = Utils.getStudentsWithLetter(allStudents, Letter.C);
        System.out.print(studentsWithLetterA.toString());
        System.out.printf(" Average rating: %.2f\n", Utils.getAverageRating(studentsWithLetterA));
        System.out.print(studentsWithLetterB.toString());
        System.out.printf(" Average rating: %.2f\n", Utils.getAverageRating(studentsWithLetterB));
        System.out.print(studentsWithLetterC.toString());
        System.out.printf(" Average rating: %.2f\n", Utils.getAverageRating(studentsWithLetterC));
    }
}