package Lesson3;

public class HomeWork {
    public static void main(String[] args) {

        //задача #1
        int enterInt = 2978;
        int sum = 0;

        while (enterInt != 0) {
            sum += enterInt % 10;
            enterInt = enterInt / 10;
        }
        System.out.println(sum);

        // задача #3

        int[] arrays = {6, 7, -8, 10, -12, 19, 20};
        System.out.println("Количество элементов в массиве = " + arrays.length);
        int count = 0;
        int sumHonest = 0;
        int sumOdd = 0;
        boolean negative = true;
        boolean ordered = true;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] >= 0){
                System.out.println(arrays[i]);
                count +=1;
            }
        }
        System.out.println("Количество положительных элементов в массиве = " + count);

        for (int i = 0; i < arrays.length; i+=2) {
            sumHonest += arrays[i];

        }
        for (int i = 1; i < arrays.length - 1; i+=2) {
            sumOdd += arrays[i];
        }
        // проверяем, что все элементы массива отрицательны
        for (int array : arrays) {
            if (array >= 0) {
                negative = false;
                break;
            }
        }

        // проверяем, что все элементы массива упорядочены по возрастанию
        for (int i = 0; i < arrays.length - 1; i++) {
            if(arrays[i] >= arrays[i + 1]) {
                ordered = false;
                break;
            }
        }

        int dif = sumHonest - sumOdd;
        System.out.println("Pазность между суммой элементов на четных позициях и нечетных позициях = " + dif);
        if(negative == true){
            System.out.println("Все элементы массива отрицательны: " + " yes");
        }
        else System.out.println("Все элементы массива отрицательны: " + " no");
        if (ordered == true){
            System.out.println("Все элементы массива упорядочены по возрастанию: " + " yes");
        }
        else System.out.println("Все элементы массива упорядочены по возрастанию: " + " no");
    }
}

