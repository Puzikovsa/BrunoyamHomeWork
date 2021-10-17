package Lesson5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HomeWork {

    //Метод проверки массива на правила равенства
    public static boolean masEquals(int[] array) {
        boolean result;
        if (array[0] < array[1] && array[1] > array[2] && array[2] < array[3] && array[3] > array[4]) {
            result = true;
        } else result = false;
        return result;
    }

    //Сложение и сортировка двух массивов
    public static int[] sortArray(int[] array1, int[] array2) {
        int[] arrays = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, arrays, 0, array1.length);
        System.arraycopy(array2, 0, arrays, (array1.length), array2.length);
        Arrays.sort(arrays);
        return arrays;
    }

    //Разбор состава строки
    public static void arrayString(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        Scanner str = new Scanner(reader);
        String chRead = "";
        char ch;
        while (str.hasNextLine()) {
            chRead += str.nextLine();
            System.out.println(chRead);
            int count = 1;
            for (int i = 0; i < chRead.length(); i++) {
                ch = chRead.charAt(i);
                if (chRead.indexOf(ch) < i)
                    continue;
                for (int j = (i + 1); j < chRead.length(); j++) {
                    if (chRead.charAt(j) == ch)
                        count++;
                }
                System.out.println(ch + " - " + count);
                count = 1;
            }
        }
    }

    //задача 4
    public static int getElement(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int a = array.length / 2;
        return array[a];
    }


    public static void main(String[] args) throws IOException {
        System.out.println(masEquals(new int[]{0, 3, 2, 6, 5}));
        int[] mas = {13, 2, 15, 4, 25};
        int[] mas1 = {6, 77, 8, 29, 10, 11, -151};
        System.out.println(Arrays.toString(sortArray(mas, mas1)));
        arrayString("C:\\Users\\puzik\\IdeaProjects\\brunoyam\\src\\Lesson5\\test.txt");
        System.out.println(getElement(mas1));
    }
}


