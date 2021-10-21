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
}
