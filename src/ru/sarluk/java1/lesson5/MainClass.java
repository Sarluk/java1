package ru.sarluk.java1.lesson5;

/**
 * Автор: Павел Матвеев
 * Дата создания: 20.05.16
 */
public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", "Черный", 3);
        Cat cat = new Cat("Матильда", "Белый", 2);
        Horse horse = new Horse("Стрела", "Белый", 4);

        dog.isRun(14);
        cat.isRun(7);
        cat.isSwim();
        horse.isJump(0.6);
    }
}
