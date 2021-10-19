package TicTacGame_New;

import java.util.Scanner;

public class Controller {
    public static Player player;
    public static Player player1;
    public static Player player2;

    public static void startGame() {
        System.out.println("Вас приветствует игра КРЕСТИКИ-НОЛИКИ");
        System.out.println("Введите размер поля");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Field gameField = new Field(size);
        System.out.println("Игровое поле создано");
        Field.showField();
        beginGame();
    }

    public static void beginGame() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первого игрока");
        System.out.println("Это компьютер? ");
        System.out.println("Если да, введите 1. Если нет - любое другое число");
        String gamer = scan.nextLine();
        if (gamer.equals("1")) {
            player1 = new ComputerPlayer(Cell.CROSS, "Computer1");
            System.out.println("Первый игрок - " + player1.getName() + ". Он ставит " + Cell.CROSS.meaning);
            System.out.println();
        } else {
            System.out.println("Как Вас зовут?");
            String name = scan.nextLine();
            player1 = new HumanPlayer(Cell.CROSS, name);
            System.out.println("Первый игрок - " + name + ". Он ставит " + Cell.CROSS.meaning);
            System.out.println();
        }
        twoGamer();
    }

    public static void twoGamer(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите второго игрока");
        System.out.println("Это компьютер? ");
        System.out.println("Если да, введите 1. Если нет - любое другое число");
        String gamer1 = scan.nextLine();
        if (gamer1.equals("1")) {
            player2 = new ComputerPlayer(Cell.ZERO, "Computer2");
            System.out.println("Второй игрок - " + player2.getName() + ". Он ставит " + player2.getTeam());
            System.out.println();
        } else {
            System.out.println("Как Вас зовут?");
            String player2Name = scan.nextLine();
            player2 = new HumanPlayer(Cell.ZERO, player2Name);
            System.out.println("Второй игрок - " + player2Name + ". Он ставит " + player2.getTeam());
            System.out.println();
        }
        selectPlayer();
    }

    public static void selectPlayer(){
        player = player1;
        player.move();
    }
    public static void changePlayer() {
        if (endGameSignal() == true) {
            System.out.println("Игра окончена.");
            System.out.println("Победил " + player.getName());
            endGame();
        } else {
            System.out.println("Переход хода");
            if (player == player1) {
                player = player2;
            } else {
                player = player1;
            }
            player.move();
        }
    }

    public static boolean endGameSignal() {
        return !Checks.checkWinner(Field.getField()).equals(Cell.EMPTY);
    }

    public static void endGame(){
    }

}
