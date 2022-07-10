public enum Letter {
    A("A"),
    B("B"),
    C("C");

    private final String letter;

    Letter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }
}