package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static boolean checkWinner(Player player) {
        boolean resalt = false;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][0].equals(Cell.EMPTY) && isLineWinner(i))  {
                    resalt = true;
                    break;
                } else
            {

            }
            }
        return resalt;
    }

    public static boolean isLineWinner(int s){
        boolean line = true;
        for (int i = 0; i < field.length - 1; i++){
            if(!field[s][i].equals(field[s][i + 1])){
                line = false;
                break;
            }
        }
        return line;
    }

    public static boolean isColumnWinner(int s) {
        boolean column = true;
        for (int i = 0; i < field.length; i++) {
            if (!field[s][i].equals(field[s][i + 1])) {
                column = false;
                break;
            }
        }
        return column;
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

