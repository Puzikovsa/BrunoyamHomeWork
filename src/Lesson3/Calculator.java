package Lesson3;

import java.util.Scanner;

public class Calculator {

    public static boolean isExit(String s) {
        return s.equalsIgnoreCase("exit");
    }

    public static void main(String[] args) {

        //задача #2

        int current = 0;
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите любое число. Для выхода введите \"exit\".");
            String number = scan.next();
            if (isExit(number)) {
                break;
            } else System.out.println("Вы ввели: " + number);
            int numberInput = Integer.parseInt(number);
            System.out.println("Введите операцию.");
            String op = scan.next();
            if (isExit(op)) {
                break;
            } else System.out.println("Вы ввели: " + op);

            switch (op) {
                case "+" -> current += numberInput;
                case "-" -> current -= numberInput;
                case "*" -> current *= numberInput;
                case "/" -> current /= numberInput;
            }
            System.out.println("Результат операции: " + current);
        }
    }
}

