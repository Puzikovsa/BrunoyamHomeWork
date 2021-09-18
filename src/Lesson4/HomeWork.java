package Lesson4;

public class HomeWork {
    //#1
    public static void printHello(String name){
        System.out.println("Hello, " + name + "!");
    }

    //#2
    public static int sumTwoInt(int a, int b){
        return a + b;
    }

    //#3
    public static String isPalindrome(String str){
        char[] array = str.toCharArray();
        boolean isPal = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != array[array.length -1 - i]){
                isPal = false;
                break;
            }
        }
        return isPal? "Представленная строка - палиндром." : "Представленная строка - не палиндром.";
    }

    //самостоятельный метод
    public static void printProduct(Products code){
        System.out.println(code);
    }

    public static void main(String[] args) {
        printHello("John");
        System.out.println(sumTwoInt(26,31));
        System.out.println(isPalindrome("DubabuD"));
        System.out.println();
        printHello("Сергей!");
        System.out.println(sumTwoInt(12,14));
        System.out.println(isPalindrome("Приорат"));
        printProduct(Products.MILK);
    }
}
