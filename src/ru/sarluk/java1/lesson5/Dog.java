package ru.sarluk.java1.lesson5;

/**
 * Автор: Павел Матвеев
 * Дата создания: 23.05.16
 */
public class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Собака \"" + this.getName() + "\" бежит со скоростью " + speed + " км/ч");
    }

    @Override
    public void isSwim() {
        System.out.println("Собака плывет");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Собака может перепрыгнуть через препятствие высотой" + height + "м");
    }
}
