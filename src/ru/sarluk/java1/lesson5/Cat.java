package ru.sarluk.java1.lesson5;

/**
 * Автор: Павел Матвеев
 * Дата создания: 23.05.16
 */
public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Кошка \"" + this.getName() + "\" бежит со скоростью " + speed + "км/ч");
    }

    @Override
    public void isSwim() {
        System.out.println("Кошка \"" + this.getName() + "\" не будет плавать, она этого крайне не любит");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Кошка перепрыгивает через препятствие");
    }
}
