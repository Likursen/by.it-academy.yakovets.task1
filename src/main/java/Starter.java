public class Starter {

    public static void main(String[] args) {
        int classSize = 5;
        Student[] classA = Utils.generateStudents(classSize, Letter.A);
        Student[] classB = Utils.generateStudents(classSize, Letter.B);
        Utils.printAllClasses(classA, classB);
        Utils.printAverageRating(classA, classB);
    }
}