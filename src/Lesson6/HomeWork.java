package Lesson6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        System.out.println(arithmeticProgress(2, 7, 15));
        System.out.println(maxDivider(52,26));
        System.out.println(minMultiple(68,34));
        System.out.println(rabbitStep("src/Lesson6/rabbitStair.txt","C:\\Users\\puzik\\IdeaProjects\\brunoyam\\rabbitStep.txt"));
    }

    // арифметическая прогрессия
    public static int arithmeticProgress(int a, int b, int n) {
        int step = b - a;
        return a + step * (n - 1);
    }

    // заяц на лестнице
    public static boolean rabbitStep(String input , String output) throws IOException {
        FileReader read = new FileReader(input);
        FileWriter writer = new FileWriter(output);
        Scanner str = new Scanner(read);
        int step = str.nextInt();
        int stair = str.nextInt();
        int[] count = new int[stair];
        count [0] = 1;
        count [1] = 2;
        for (int i = 2; i < step; i++) {
            count[i] = count[i - 1] + i;
        }
        for (int i = step; i < stair; i++) {
            count[i] = count[i - 1] + i;
        }
        System.out.println(Arrays.toString(count));
        writer.write(String.valueOf(count[stair - 1]));
        writer.close();
        return true;
    }

    //наибольший общий делитель
    public static int maxDivider(int a, int b) {
        int max = 0;
        int min = 0;
        if(a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        while (min != 0){
            int gcf = max % min;
            max = min;
            min = gcf;
            }
        return max;
    }
    //Наименьшее общее кратное
    public static int minMultiple(int a, int b){
        return a * b / maxDivider(a, b);
    }
}
