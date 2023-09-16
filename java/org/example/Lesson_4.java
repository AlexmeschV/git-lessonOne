package org.example;


public class Lesson_4 {
    public static void main(String[] args) {

        java.time.LocalTime currentTime = java.time.LocalTime.now();
        functionGreetings(currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond(), System.getProperty("user.name"));

    }
    public static void functionGreetings(int hour, int minutes, int seconds, String userName){
        if ((hour <= 11) && (hour >= 5)) {
            System.out.println("Доброе утро, " + userName);
        } else {
            if ((hour <= 15) && (hour >= 12)) {
                System.out.println("Добрый день, " + userName);
            } else {
                if ((hour <= 22) && (hour >= 16)) {
                    System.out.println("Добрый вечер, " + userName);
                } else {
                    System.out.println("Доброй ночи, " + userName);
                }
            }
        }
    }
}
