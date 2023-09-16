package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // считываем число с клавиатуры
        
        boolean isFizz = false;
        boolean isBuzz = false;
        
        while (isFizz || isBuzz) { // пока числа не равны друг другу
            if (num % 3 == 0) { // если число четное
                isFizz = true;
            } else if (num % 5 == 0) { // если число нечетное
                isBuzz = true;
            } else { // иначе выводим текущее число
                System.out.println(num);
            }
            num /= 10; // делим число на 10 и уменьшаем его на 1
        }
        
        if (isFizz) {
            System.out.println("FizzBuzz");
        } else if (isBuzz) {
            System.out.println("Buzz");
        } else {
            System.out.println("Correct!");
        }
    }
}