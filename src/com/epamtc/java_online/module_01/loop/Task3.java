package com.epamtc.java_online.module_01.loop;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class Task3 {

    public static void main(String[] args) {

        int sumSquares;

        sumSquares = 0;

        for (int i = 0; i <= 100; i++) {
            sumSquares += Math.pow(i, 2);
        }

        System.out.printf("Сумма квадратов первых ста чисел равна %d", sumSquares);
    }
}
