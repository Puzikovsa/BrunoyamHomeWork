package TicTacGame_New;

public class Field {
    private static Cell[][] field;
    private static int size;

    public static int getSize() {
        return size;
    }

    public static Cell[][] getField() {
        return field;
    }

    public static void setField(Cell[][] field) {
        Field.field = field;
    }

    public Field(int size) {
        Field.size = size;
        field = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = Cell.EMPTY;
            }
        }
    }

    public static void fillingField(int row, int column, Player player){

        field[row][column] = player.getTeam();
    }

    public static void showField() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (field[i][j]) {
                    case EMPTY -> System.out.print(Cell.EMPTY.meaning);
                    case CROSS -> System.out.print(Cell.CROSS.meaning);
                    case ZERO -> System.out.print(Cell.ZERO.meaning);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

//    public Cell checkWinner() {
//        for (int i = 0; i < field.length; i++) {
//            // совпадение элементов в строке
//            if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && !field[i][2].equals(Cell.EMPTY)) {
//                return field[i][0];
//            }
//            // совпадение элементов в столбце
//            if (field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && !field[2][i].equals(Cell.EMPTY)) {
//                return field[0][i];
//            }
//        }
//        if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && !field[2][2].equals(Cell.EMPTY)) {
//            return field[0][0];
//        }
//        if (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && !field[2][0].equals(Cell.EMPTY)) {
//            return field[1][1];
//        }
//        return Cell.EMPTY;
//    }
//
//    public boolean setValue(int row, int column, Cell playerSign) {
//        if (isEmpty(row, column)) {
//            field[row][column] = playerSign;
//            return true;
//        }
//        return false;
//    }
}
