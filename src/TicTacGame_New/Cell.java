package TicTacGame_New;

public enum Cell {
    EMPTY("_ "),
    CROSS("X "),
    ZERO("0 ");

    String meaning;

    Cell(String meaning) {
        this.meaning = meaning;
    }
}
