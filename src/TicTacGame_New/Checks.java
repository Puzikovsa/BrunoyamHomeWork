package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static boolean checkWinner(Player player){
        boolean check = false;
//        if (firsrCheckWinner()){
//            check = true;
        if (isColumnWinner()){
                check = true;
            }
//        if (isLeftDiagonalWinner()){
//            check = true;
//        }
        return check;
    }

    public static boolean firsrCheckWinner() {
        boolean resalt = false;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][0].equals(Cell.EMPTY) && isLineWinner(i)) {
                resalt = true;
                break;
            }
        }
        return resalt;
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

    public static boolean isColumnWinner() {
        boolean column = true;
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != Cell.EMPTY && field[i][j] != field[i + 1][j]) {
                    column = false;
                    break;
                }
            }
        }
        return column;
    }

    public static boolean isRightDiagonalWinner(){
        boolean rightDiagonal = true;
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = 0; j < field[i].length - 1; j++) {
                if (field[0][0] != Cell.EMPTY && (field[i][j] != field[i + 1][j + 1] && field[i + 1][j + 1] != field[field.length - 1][field.length - 1])) {
                    rightDiagonal = false;
                    break;
                }
            }

        }
        return rightDiagonal;
    }

    public static boolean isSecondRightDiagonal(int s){
        boolean rightDiagonal = true;
        for (int i = 0; i < field.length - 1; i++) {
            if (!field[i][s].equals(field[i + 1][s + 1])) {
                rightDiagonal = false;
                break;
            }
        }
        return rightDiagonal;
    }

    public static boolean isLeftDiagonalWinner(){
        boolean leftDiagonal = true;
        for (int i = field.length - 1; i >= 1; i--) {
            for (int j = 0; j < field[i].length - 1; j++) {
                if (!field[0][0].equals(Cell.EMPTY) && isSecondLeftDiagonal(j)) {
                    leftDiagonal = false;
                    break;
                }
            }

        }
        return leftDiagonal;
    }

    public static boolean isSecondLeftDiagonal(int s){
        boolean leftDiagonal = true;
        for (int i = 0; i < field.length - 1; i++) {
            if (!field[i][s].equals(field[i + 1][s + 1])) {
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

