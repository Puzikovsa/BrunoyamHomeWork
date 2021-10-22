package TicTacGame_New;

public class Checks {
    public static Cell[][] field = Field.getField();

    public static boolean isEmpty(int row, int column, Cell[][] field) {
        return field[row][column] == Cell.EMPTY;
    }

    public static boolean checkWinner(Player player) {
        boolean resalt = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 1; j < field[i].length - 1; j++) {
                if (field[i][j] == Cell.EMPTY || !field[i][j - 1].equals(field[i][j]) || !field[i][j].equals(field[i][j + 1]))
                {
                    break;
                } else resalt = true;
            }
        }
        System.out.println(resalt);
        return resalt;
    }

    public static boolean isLineWiner(String[] line){
        for (int i = 0; i < line.length - 1; i++){
            if(!line[i].equals(line[i + 1])){
                break;
            }
        }
        return true;
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

