package lesson1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayHello();
        arrMax();

    }

    private static void sayHello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println(LocalDateTime.now());
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("Hello, " + name + "!");
        in.close();
    }

    //    Дан массив двоичных чисел, например [1,1,0,1,1,1],
    //    вывести максимальное количество подряд идущих 1.
    private static void arrMax() {
        int[] arr = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            }
            if (arr[i] == 0 && count < temp) {
                count = temp;
                temp = 0;
            }
            if (count > temp && arr[i] == 0) {
                temp = 0;
            }
        }
        if (temp > count) {
            System.out.println(temp);
        } else System.out.println(count);
    }

    private static void putElToEnd() {
        int [] arr = new int[] {3,2,2,3};
        int val = 3;

        for (int i = 0; i < 5 ; i++) {

        }
    }

}

