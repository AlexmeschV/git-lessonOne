package org.example.Lesson_02;

import java.util.Scanner;

public class Lesson_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        printingPrimeNumbers(number);
    }
    public static void printingPrimeNumbers (int Number){
        for (int i = 2; i <= Number; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }
}
