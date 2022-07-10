public class Student {

    private final String letter;
    private final String name;
    private final int rating;

    public Student(String name, int rating, String letter) {
        this.name = name;
        this.letter = letter;
        this.rating = rating;
    }

    public String getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " " + rating;
    }
}