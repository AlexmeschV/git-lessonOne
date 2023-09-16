package org.example.Lesson_02;

import java.util.Scanner;

public class Lesson_01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Количество пробелов в строке: " + count);
    }
}
