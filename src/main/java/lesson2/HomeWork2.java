package lesson2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
//        System.out.println(Palindrom());
//        fileCreate(stringCreate());
    }

    //    1. Напишите метод, который принимает на вход строку (String)
    //    и определяет является ли строка палиндромом (возвращает boolean значение)
    public static Boolean Palindrom() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String value = in.nextLine();
        boolean newValue = value.equals((new StringBuilder(value)).reverse().toString());
        return newValue;
    }

//    2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.

    public static String stringCreate() {
        StringBuilder builder = new StringBuilder(100);
        for (int i = 0; i < 100; i++) {
            builder.append("TEST ");
        }
        String newString = builder.toString();
        System.out.println(newString);
        return newString;
    }

    public static void fileCreate(String s) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("D:\\java_seminar\\src\\main\\java\\lesson2\\test.txt");
            pw.print(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
    }
}
