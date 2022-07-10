import java.util.List;

public class Starter {

    public static void main(String[] args) {
        int studentsCount = 15;
        List<Student> allStudents = Utils.generateStudents(studentsCount);
        Utils.printStudentsInClass(allStudents, Letter.A);
        Utils.calculateAndPrintAverageRatingInClass(allStudents, Letter.A);
        Utils.printStudentsInClass(allStudents, Letter.B);
        Utils.calculateAndPrintAverageRatingInClass(allStudents, Letter.B);
        Utils.printStudentsInClass(allStudents, Letter.C);
        Utils.calculateAndPrintAverageRatingInClass(allStudents, Letter.C);
    }
}