package TicTacGame_New;

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
            int row = (int) ( Math.random() * (size));
            int column = (int) ( Math.random() * (size));
            if (row >= 0 && row < size && column >= 0 && column < size) {
                if (Checks.isEmpty(row, column, Field.getField())) {
                    Field.fillingField(row, column, player);
                    Field.showField();
                    break;
                } else gameMove();
            }
        }
        Controller.changePlayer();
    }
}
