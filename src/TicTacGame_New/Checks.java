package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static boolean checkWinner(Player player) {
        boolean resalt = false;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                count += field[i][j].sum;
            }
            count1 = count;
            System.out.println(count1);
            if (count1 == player.getSum() * field.length) {
                resalt = true;
            }
        }
        System.out.println(resalt);
        return resalt;
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

