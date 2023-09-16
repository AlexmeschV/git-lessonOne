package org.example;

import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную а: ");
        float a = scanner.nextFloat();
        System.out.print("Введите переменную b: ");
        float b = scanner.nextFloat();
        float c = a / b;
        System.out.println(c);


    }
}
