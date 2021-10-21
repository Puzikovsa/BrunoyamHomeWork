package TicTacGame_New;

public class Checks {
    public Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static Cell firstCheckWinner(Cell[][] field) {
        Cell cell = null;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length - 1; j++) {
                if (!field[i][j].equals(Cell.EMPTY) && field[i][j].equals(field[i][j + 1])) {
                    cell = field[i][field.length - 1];
                } else {
                    if (!field[i][j].equals(Cell.EMPTY) && field[i][j].equals(field[i + 1][j])) {
                       cell = field[field.length -1][j];
                    } else {
                        if (!field[i][j].equals(Cell.EMPTY) && field[i][j].equals(field[i + 1][j + 1])) {
                            cell = field[field.length - 1][field.length -1];
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = field.length  - 1; j < 0; j--) {
                if (!field[i][j].equals(Cell.EMPTY) && field[i][j].equals(field[i + 1][j - 1])) {
                    cell = field[field.length - 1][field.length - 1];
                } else break;
            }
        }
        System.out.println(cell);
        return cell;
    }

    public static void secondCheckWinner(Cell[][] field) {
        stopGame();
    }

    public static boolean stopGame() {
        return true;
    }
}

