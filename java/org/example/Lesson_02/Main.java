package org.example.Lesson_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number; i++){
            System.out.println(i);
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println("Число не является простым");
        }
    }
}
