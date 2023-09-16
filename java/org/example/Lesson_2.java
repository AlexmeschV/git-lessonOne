package org.example;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        functionEvenNumber(scanner.nextInt());

    }
    public static void functionEvenNumber(int a){
        if (a%2 == 0) {
            System.out.println("Введено четное число");
        } else {
            System.out.println("Введено нечетное число");
        }
    }
}
