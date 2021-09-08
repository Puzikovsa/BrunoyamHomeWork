package Lesson2;

public class HomeWork {

    public static void main(String[] args) {
        //задача 1
        int a = 244;

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число нечетное");
        //задача2

        a = 34;
        int b = 23;
        int c = 166;
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Среднее число - " + b);
            } else System.out.println("Среднее число - " + c);
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Среднее число - " + a);
            } else System.out.println("Среднее число - " + c);
        } else if (c > b && c > a) {
            if (a > b) {
                System.out.println("Среднее число - " + a);
            } else System.out.println("Среднее число - " + b);
        }

        //задача3
        int x = 0;
        int y = 0;

        if (x >= 0 && y >= 0){
            System.out.println("Точка XY в I четверти;");
        }
        else if (x < 0 && y >= 0){
            System.out.println("Точка XY во II четверти;");
        }
        else if (x < 0 && y < 0){
            System.out.println("Точка XY в III четверти;");
        }
        else System.out.println("Точка XY в IV четверти;");

        //задача4
        a = 5;
        b = 6;
        c = 7;
        if (a + b > c){
            System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " существует.");
        }
        else  System.out.println("Треугольника со сторонами " + a + ", " + b + ", " + c + " не существует.");

    }
}
