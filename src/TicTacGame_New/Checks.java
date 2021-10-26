package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static boolean checkWinner(Player player) {
        boolean check = false;
        if (isfirsrLineWinner()) {
            check = true;
        }
            if (isFirstColumnWinner()) {
            check = true;
        }
            if (isRightDiagonalWinner()) {
            check = true;
        }
            if (isLeftDiagonalWinner()) {
            check = true;
        }
        return check;
    }

    public static boolean isfirsrLineWinner() {
        boolean line = false;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][0].equals(Cell.EMPTY) && isLineWinner(i)) {
                line = true;
                break;
            }
        }
        return line;
    }

    public static boolean isLineWinner(int s) {
        boolean line = true;
        for (int i = 0; i < field.length - 1; i++) {
            if (!field[s][i].equals(field[s][i + 1])) {
                line = false;
                break;
            }
        }
        return line;
    }

    public static boolean isFirstColumnWinner() {
        boolean column = false;
        for (int i = 0; i < field[i].length - 1; i++) {
            if (!field[0][i].equals(Cell.EMPTY) && isSecondColumnWinner(i)) {
                column = true;
                break;
            }
        }
        return column;
    }

    public static boolean isSecondColumnWinner(int s) {
        boolean column = true;
        for (int i = 0; i < field[i].length - 1; i++) {
            if (!field[i][s].equals(field[i + 1][s])) {
                column = false;
                break;
            }
        }
        return column;
    }

    public static boolean isRightDiagonalWinner() {
        boolean rightDiagonal = false;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][i].equals(Cell.EMPTY) && isSecondRightDiagonal()) {
                rightDiagonal = true;
                break;
            }
        }
        return rightDiagonal;
    }

    public static boolean isSecondRightDiagonal() {
        boolean rightDiagonal = true;
        for (int i = 0; i < field.length - 1; i++) {
            if (!field[i][i].equals(field[i + 1][i + 1])) {
                rightDiagonal = false;
                break;
            }
        }
        return rightDiagonal;
    }

    public static boolean isLeftDiagonalWinner() {
        boolean leftDiagonal = false;
        for (int i = field.length - 1; i >= 0; i--) {
            if (!field[i][0].equals(Cell.EMPTY) && isSecondLeftDiagonal()) {
                leftDiagonal = true;
                break;
            }
        }
        return leftDiagonal;
    }

    public static boolean isSecondLeftDiagonal() {
        boolean leftDiagonal = true;
        for (int i = field.length - 1; i > 0; i--) {
            if (!field[i][field.length - i - 1].equals(field[i - 1][field.length - i])) {
                leftDiagonal = false;
                break;
            }
        }
        return leftDiagonal;
    }

    public static boolean isBusy() {
        boolean busy = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals(Cell.EMPTY)) {
                    busy = false;
                    break;
                } else busy = true;
            }
        }
        return busy;
    }
}

