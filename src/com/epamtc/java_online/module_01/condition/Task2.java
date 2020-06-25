package com.epamtc.java_online.module_01.condition;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int lessBetweenAB;
        int lessBetweenCD;

        a = 2;
        b = 10;
        c = 5;
        d = 25;

        if (a < b) {
            lessBetweenAB = a;
        } else {
            lessBetweenAB = b;
        }

        if (c < d) {
            lessBetweenCD = c;
        } else {
            lessBetweenCD = d;
        }

        if (lessBetweenAB > lessBetweenCD) {
            System.out.printf("Искомое значение: %d", lessBetweenAB);
        } else {
            System.out.printf("Искомое значение: %d", lessBetweenCD);
        }
    }
}
