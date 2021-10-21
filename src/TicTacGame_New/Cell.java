package TicTacGame_New;

public enum Cell {
    EMPTY("_ ", 0),
    CROSS("X ", 20),
    ZERO("0 ", 10);

    String meaning;
    int sum;

    Cell(String meaning, int sum) {
        this.meaning = meaning;
        this.sum = sum;
    }
}
