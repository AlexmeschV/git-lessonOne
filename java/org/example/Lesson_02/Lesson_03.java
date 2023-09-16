package org.example.Lesson_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lesson_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        System.out.print("Введите количество листов: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++){
            System.out.print("Введите размерность и содержимое листа с разделением в виде пробела: ");
            int currentSize = scanner.nextInt();
            List<Integer> currentList = new ArrayList<>();
            for (int j = 0; j < currentSize; j++){
                currentList.add(scanner.nextInt());
            }
            list.add(currentList);
        }
        scanner.close();


        elementCountInSheet(number, list);
    }
    public static void elementCountInSheet (int enteredNumber, List<List<Integer>> allLists){

        int numbersCount = 0;           // счетчик количества цифр в числе
        int counter = enteredNumber;    // заводим переменную, чтобы её менять
        do {
            numbersCount++;
            counter /= 10;
        } while(counter != 0);


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < allLists.size(); i++){
            //System.out.println(allLists.get(i).size());
            list1.add(i, allLists.get(i).size());
        }
        System.out.println("---------------------- Выводим количество элементов в каждом листе");
        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

        int counter2 = enteredNumber;    // заводим переменную, чтобы её менять
        int counter22;
        int ii = 0;                        // инкремент для индекса list2
        while(counter2>0) {
            counter22 = counter2%10;
            list2.add(ii, counter22);
            ii++;
            counter2 = counter2/10;
        }
        Collections.reverse(list2);

                System.out.println("---------------------- Выводим цифры в числе, которое вводили");
        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }

        if (list1.equals(list2) && (allLists.size() == numbersCount)) {
            System.out.println("true");
        }

    }
}
