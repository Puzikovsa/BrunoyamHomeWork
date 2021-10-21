package TicTacGame_New;

import java.util.Scanner;

public class HumanPlayer extends Player {


    public HumanPlayer(Cell team, String name) {
        super(team, name);
    }

    @Override
    void move() {
        gameMove();
    }

    private void gameMove() {
        Player player = Controller.player;
        int row;
        int column;
        int size = Field.getSize();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player.getName() + ", Ваш ход");
            System.out.println("Введите строку");
            System.out.println("От 0 до " + (size - 1));
            row = scanner.nextInt();
            System.out.println("Введите столбец");
            System.out.println("От 0 до " + (size - 1));
            column = scanner.nextInt();
            if (row >= 0 && row < size && column >= 0 && column < size) {
                if (Checks.isEmpty(row, column, Field.getField())) {
                    Field.fillingField(row, column, player);
                    Field.showField();
                    break;
                } else {
                    System.out.println("Ячейка занята");
                }
            } else {
                System.out.println("Вы ошиблись");
            }
        }
        Checks.firstCheckWinner(Field.getField());
        Controller.changePlayer();
    }
}
