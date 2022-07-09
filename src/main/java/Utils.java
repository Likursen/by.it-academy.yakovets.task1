import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Utils {
    public static Student[] generateStudents(int count, Letter letter) {
        Student[] studentArray = new Student[count];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student(generateRandomName(), generateRandomGrade(), letter);
        }
        return studentArray;
    }

    public static String generateRandomName() {

        String firstLetter = RandomStringUtils.random(1, 65, 90, false, false);
        String otherLetters = RandomStringUtils.random(5, 97, 122, false, false);
        return firstLetter + otherLetters;
    }

    public static int generateRandomGrade() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static void printAllClasses(Student[]... classes) {
        for (Student[] aClass : classes) {
            System.out.println(Arrays.toString(aClass));
        }
    }

    public static void printAverageRating(Student[]... classes) {
        LinkedList<Double> averageRatingAllClasses = new LinkedList<Double>();
        double averageRating;
        for (Student[] aClass : classes) {
            averageRating = 0;
            for (Student student : aClass) {
                averageRating += student.getRating();
            }
            averageRatingAllClasses.add(averageRating / aClass.length);
        }
        System.out.println(averageRatingAllClasses);
    }
}