package ru.sarluk.java1.lesson5;

/**
 * Автор: Павел Матвеев
 * Дата создания: 23.05.16
 */
public class Horse extends Animal {
    public Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Лошадь бежит");
    }

    @Override
    public void isSwim() {
        System.out.println("Лошадь не будет плавать, только если помочить копыта)");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Лошадь может перепрыгнуть через препятствие высотой " + height + "м");
    }
}
