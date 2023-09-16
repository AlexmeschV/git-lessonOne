package org.example.Lesson_03;

public class Phone {
    int number;
    String model;
    double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }
    public int getNumber() {
        return number;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(number, model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
        this.number = 0;
        this.model = "";
        this.weight = 0;
    }
    public void sendMessage(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
