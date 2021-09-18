package NewPrograms;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {

        System.out.println("Вас приветствует игра КРЕСТИКИ-НОЛИКИ!");
        //создаем игровое поле
        String[][] playingField = new String[3][3];
        for (String[] strings : playingField) {
            for (int j = 0; j < strings.length; j++) {
                Arrays.fill(strings, "_");
            }
        }
        printArray(playingField);
        System.out.println("Игровое поле создано");
        System.out.println();
        String cellValue;
        String name;
        String cell1 = "X";
        String cell2 = "O";
        //Начинаем игру
        System.out.println("Введите имя первого игрока");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        System.out.println("Введите имя второго игрока");
        String name2 = scan.next();
        name = name1;
        cellValue = cell1;

        //Первый ход игрока
        while (true) {
            System.out.println(name + ", Ваш ход");
            System.out.println("Введите строку");
            int x = scan.nextInt();
            System.out.println("Введите столбец");
            int y = scan.nextInt();
            if (x >= 0 && x < playingField.length && y >= 0 && y < playingField.length) {
                if (playingField[x][y].equals("_")) {
                    playingField[x][y] = cellValue;
                    printArray(playingField);
                } else {
                    System.out.println("Ячейка занята");
                    continue;
                }
            } else {
                System.out.println("Вы ошиблись");
                continue;
            }
            //Проверка победителя
            if (checkWin(playingField).equals(cellValue)) {
                System.out.println(name + "! Вы победили! Поздравляем с победой!");
                break;
            }
            //Проверка заполненности поля
            if (!checkField(playingField)) {
                System.out.println("Поле заполнено полностью.");
                System.out.println("У вас ничья.");
                break;
            }
            //Переход хода
            if (Objects.equals(name, name1)) {
                name = name2;
                cellValue = cell2;
            } else {
                name = name1;
                cellValue = cell1;
            }
        }
    }

    //Метод печать массива
    public static void printArray(String[][] array) {
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    //Метод проверки победителя
    public static String checkWin(String[][] array) {
        String result = "";
        for (String[] strings : array) {
            if (strings[0].equals(strings[1]) && strings[1].equals(strings[2]) && !strings[2].equals("_")) {
                result = strings[0];
                break;
            }
            for (int j = 0; j < strings.length; j++) {
                if (array[0][j].equals(array[1][j]) && array[1][j].equals(array[2][j]) && !array[2][j].equals("_")) {
                    result = array[0][j];
                    break;
                } else if (array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2]) && !array[2][2].equals("_")) {
                    result = array[0][0];
                    break;
                } else if (array[2][0].equals(array[1][1]) && array[1][1].equals(array[0][2]) && !array[0][2].equals("_")) {
                    result = array[2][0];
                    break;
                } else result = "unknown";
            }
        }
        return result;
    }

    //Метод проверки заполненности ячеек
    public static boolean checkField(String[][] array) {
        boolean fieldFull = false;
        for (String[] strings : array) {
            for (String string : strings) {
                if (string.equals("_")) {
                    fieldFull = true;
                    break;
                }
            }
        }
        return fieldFull;
    }
}
