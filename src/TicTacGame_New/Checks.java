package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static Cell checkWinner() {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        Cell resalt = null;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                count += field[i][j].sum;
                    }
                }
        System.out.println(count);
        if (count == Cell.CROSS.sum * field.length){
            resalt = Cell.CROSS;
        } else if(count == Cell.ZERO.sum * field.length ){
            resalt = Cell.ZERO;
        }
        return resalt;
        }
//        for (int i = 0; i < field.length - 1; i++) {
//            for (int j = field.length - 1; j < 0; j--) {
//                if (!field[i][j].equals(Cell.EMPTY) && field[i][j].equals(field[i + 1][j - 1])) {
//                    win = true;
//                } else break;
//            }
//        }
//        return win;
//    }

    public static boolean isBusy() {
        boolean busy = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals(Cell.EMPTY)) {
                    busy = false;
                    break;
                } else  busy = true;
            }
        }
        return busy;
    }
}

