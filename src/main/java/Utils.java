import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Student> generateStudents(int count) {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < count; i++) {
            studentList.add(new Student(getRandomName(), getRandomGrade(), getRandomClassLetterInBound()));
        }
        return studentList;
    }

    public static List<Student> getStudentsWithLetter(List<Student> studentList, Letter letter) {
        List<Student> studentsInChooseClass = new ArrayList<Student>();
        for (Student student : studentList) {
            if (student.getLetter().equals(letter.getLetter())) {
                studentsInChooseClass.add(student);
            }
        }
        return studentsInChooseClass;
    }

    private static String getRandomName() {
        String firstLetter = RandomStringUtils.random(1, 'A', 'Z', false, false);
        String otherLetters = RandomStringUtils.random(5, 'a', 'z', false, false);
        return firstLetter + otherLetters;
    }

    private static int getRandomGrade() {
        return RandomUtils.nextInt(1, 10);
    }

    private static String getRandomClassLetterInBound() {
        return RandomStringUtils.random(1, 'A', 'D', false, false);
    }

    public static double getAverageRating(List<Student> studentList) {
        double sumAllStudentsRating = 0;
        for (Student student : studentList) {
            sumAllStudentsRating += student.getRating();
        }
        return sumAllStudentsRating / studentList.size();
    }
}