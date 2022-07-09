public class Student {

    private final Letter letter;
    private String name;
    private int rating;

    public Student(String name, int rating, Letter letter) {
        this.name = name;
        this.letter = letter;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return letter + " " + name + " " + rating;
    }
}