package TicTacGame_New;

public class Checks {
    public Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static Cell checkWinner(Cell[][] field) {
//        проверка строк
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length - 1; j++) {
                if(!field[i][j].equals(Cell.EMPTY) && !field[i][j].equals(field[i][j + 1])){
                    break;
                } else return field[i][j];

            }

        }
        return field[0][0];
    }
}
