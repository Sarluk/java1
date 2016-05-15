package ru.sarluk.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Автор: Павел Матвеев
 * Дата создания: 14.05.2016.
 */
public class MainClass {
    private static final int SIZE = 5;
    private static final int OTHER_OPTION = 4;
    private static char[][] field = new char[SIZE][SIZE];
    private static final char emptyDot = '*';
    private static final char playerDot = 'X';
    private static final char aiDot = 'O';
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        printField();

        while (true) {
            playerGo();
            if(isCheckWin(playerDot, OTHER_OPTION)){
                System.out.println("Победил человек!");
                break;
            }
            if(!isFieldFull()){
                System.out.println("Ничья");
                init();
                playerGo();
            }

            printField();
            //aiGo();
        }

    }

    private static boolean isCheckWin(char dot, int otherOption) {
        int counterX = 0;
        int counterY = 0;
        int counterXY = 0;
        int counterYX = 0;
        int counter = SIZE - 1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(field[i][j] == dot) counterX++;
                if(field[j][i] == dot) counterY++;
                //if(field[i][j] == dot && i == j) counterXY++;
                if(field[i][j] == dot && (counter - i == j)) counterYX++;





                //if(counterX == SIZE || counterX == otherOption) return true;
                //if(counterY == SIZE || counterY == otherOption) return true;

            }

            //if(counterXY == SIZE) return true;
            //System.out.println("counterXY: " + counterXY );
            //System.out.println("counterX: " + counterX);
            //System.out.println("counterY: " + counterY);
            System.out.println("---counterYX: " + counterYX );

            //counterX = 0;
            //counterY = 0;
            //if(i == SIZE) counterXY = 0;
            if(i == SIZE) counterYX = 0;

        }
        return false;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(field[i][j] == emptyDot) return true;
            }
        }
        return false;
    }

    private static void aiGo() {
        int x, y;
        Random rand = new Random();
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isEmptyDot(x, y));
        setDot(x, y, aiDot);
        printField();
    }

    private static void playerGo() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y (1-3)");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isEmptyDot(x, y));
        setDot(x, y, playerDot);
    }

    private static boolean isEmptyDot(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (field[y][x] == emptyDot) return true;
        return false;

    }

    private static void setDot(int x, int y, char dot) {
        field[y][x] = dot;
    }

    private static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }

    private static void init() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = emptyDot;
            }
        }
    }
}
