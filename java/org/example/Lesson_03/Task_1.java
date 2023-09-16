package org.example.Lesson_03;

public class Task_1 {
    public static void main (String[] args){
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();
        Phone phoneThree = new Phone();
        phoneOne.number = 92737335350;
        phoneOne.model = "Nokia";
        phoneOne.weight = 150.25;
        phoneTwo.number = 92737335360;
        phoneTwo.model = "Samsung A10";
        phoneTwo.weight = 160.55;
        phoneThree.number = 92737335370;
        phoneThree.model = "Philips E100";
        phoneThree.weight = 125.50;
        System.out.println("Объект №1 - " + phoneOne.number + " " + phoneOne.model  + " " + phoneOne.weight);
        System.out.println("Объект №2 - " + phoneTwo.number + " " + phoneTwo.model  + " " + phoneTwo.weight);
        System.out.println("Объект №3 - " + phoneThree.number + " " + phoneThree.model  + " " + phoneThree.weight);
        phoneOne.receiveCall("Вова");
        phoneOne.getNumber();
        phoneTwo.receiveCall("Саша");
        phoneTwo.getNumber();
        phoneThree.receiveCall("Аркаша");
        phoneThree.getNumber();
        phoneOne.receiveCall("Егор", 9273609685);

        /*
        Задача №1 - файлы Phone.java и Task_1.java
        Задача №2 - файл Matrix.java
         */
    }
}
