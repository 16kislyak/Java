package lesson1;


import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
//        arrayCreate();
//        findMaxMin();
//        putElToEnd();
//        sayHello();
    }

    //    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

    private static int[] arrayCreate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = in.nextInt();
        int array[] = new int[length];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        for (int j = 0; j < length; j++) {
            System.out.print(" " + array[j]);
        }
        System.out.println();
        return array;
    }

    private static void findMaxMin() {
        int[] arr = arrayCreate();
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    //    2. Дан массив nums = [3,2,2,3] и число val = 3.
    //    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    //    а остальные - равны ему.

    public static void putElToEnd() {
        int[] arr = {3, 2, 2, 3, 3, 8, 6};
        int k = 0;
        int val = 3;
        for (int i : arr) {
            if (i != val) {
                arr[k++] = i;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
    }

    //        3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//           "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//           "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//           "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//           "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void sayHello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        LocalTime localTime = LocalTime.now();
        int hours = localTime.getHour();
        if (hours >= 5 && hours < 12) {
            System.out.println("Доброе утро, " + name + "!");
        }
        else if (hours >= 12 && hours < 18) {
            System.out.println("Добрый день, " + name + "!");
        }
        else if (hours >= 18 && hours < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        }
        else if (hours >= 23 && hours < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }
        in.close();
    }
}


