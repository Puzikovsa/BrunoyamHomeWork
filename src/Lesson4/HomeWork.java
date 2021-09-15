package Lesson4;

public class HomeWork {
    //#1
    public void printHello(String name){
        System.out.println("Hello, " + name + "!");
    }

    //#2
    public int sumTwoInt(int a, int b){
        return a + b;
    }

    //#3
    public String isPalindrome(String str){
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

    public static void main(String[] args) {
        HomeWork n1 = new HomeWork();
        n1.printHello("Anna");
        System.out.println(n1.sumTwoInt(4,31));
        System.out.println(n1.isPalindrome("BuraruB"));
    }
}
