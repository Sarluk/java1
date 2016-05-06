package ru.sarluk.java1.lesson1;

/**
 * Author: Sarluk on 06.05.16.
 * Первый урок. Домашнее задание.
 */
public class MainClass {

    public static void main(String[] args){
        byte vByte = 127;
        short vShort = 32767;
        int vInt = 2147483647;
        long vLong = 9223372036854775807L;
        float vFloat = 30.24f;
        double vDouble = 4530.34d;
        boolean vBool = true;
        char vChar = 'r';


        //Какие-то вычисления
        System.out.println(calculate(2, 2, 12, 4));

        //Проверка на диапазон числа 10 - 20
        System.out.println(checkSumm(10,20));
        System.out.println(checkSumm2(10,10));

        //Проверка на високосный год
        System.out.println("4: "+leap(4));
        System.out.println("5: "+leap(5));
        System.out.println("900: "+leap(900));
        System.out.println("1200: "+leap(1200));
    }

    private static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    private static boolean checkSumm(int a, int b){
        int c = a + b;

        if(c > 10 && c < 20){
            return true;
        }

        return false;
    }

    /*
    * IDEA подсказала, что можно не использовать условие, если тип метода boolean.
    * По этому решил написать еще один метод аналог.
    * */
    private static boolean checkSumm2(int a, int b){
        int c = a + b;

        return (c >= 10 && c <= 20);
    }

    private static boolean leap(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }

        //Либо так
        /*else if(year %400 == 0){
            return true;
        }*/

        return false;
    }
}
