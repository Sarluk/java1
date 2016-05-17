package ru.sarluk.java1.lesson4;

/**
 * Автор: Павел Матвеев
 * Дата создания: 17.05.16
 */
public class MainClass {
    public static void main(String[] args) {
        Specialist[] specialistArr = new Specialist[5];
        specialistArr[0] = new Specialist("Иванов Иван Иванович", "Директор", "director@test.ru", "+7 (000) 000-00-00", 150000, 45);
        specialistArr[1] = new Specialist("Петров Петр Петрович", "Разнорабочий", "", "+7 (000) 000-00-01", 35000, 37);
        specialistArr[2] = new Specialist("Максимов Виталий Генадьевич", "Руководитель отдела продаж", "marketing@test.ru", "+7 (000) 000-00-00", 90000, 27);
        specialistArr[3] = new Specialist("Продавцов Продавец Продавесович", "Продавец", "u1@test.ru", "+7 (000) 000-00-00", 60000, 47);
        specialistArr[4] = new Specialist("Купилов Купи Купилович", "Продавец", "u2@test.ru", "+7 (000) 000-00-00", 600000, 35);

        for (Specialist i : specialistArr) {
            if (i.getAge() > 40) {
                System.out.println(i);
            }

        }
    }
}
