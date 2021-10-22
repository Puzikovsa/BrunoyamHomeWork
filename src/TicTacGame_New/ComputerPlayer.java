package TicTacGame_New;

import java.util.Random;

public class ComputerPlayer extends Player {


    public ComputerPlayer(Cell team, String name) {
        super(team, name);
    }

    @Override
    void move() {
        gameMove();
    }

    private void gameMove() {
        Player player = Controller.player;
        int size = Field.getSize();
        while (true) {
            Random ran = new Random(size - 1);
            double randomNumber = Math.floor(ran.nextDouble());
            int row = (int) randomNumber;
            Random col = new Random(size - 1);
            double randomNamber1 = Math.floor(col.nextDouble());
            int column = (int) randomNamber1;
            if (row >= 0 && row < size && column >= 0 && column < size) {
                if (Checks.isEmpty(row, column, Field.getField())) {
                    Field.fillingField(row, column, player);
                    Field.showField();
                    break;
                }
            }
        }
        System.out.println("Переход хода");
        Controller.changePlayer();
    }
}
