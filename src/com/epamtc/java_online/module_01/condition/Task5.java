package com.epamtc.java_online.module_01.condition;

/*
 * Вычислить значение функции:
 * F(x) = x^2-3x+9, если x<=3;
 * F(x) = 1/(x^3+6), если x>3.
 */

public class Task5 {

    public static void main(String[] args) {

        int x;
        double y;

        x = 5;

        if (x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;
        } else {
            y = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.printf("В точке х равной %d функция F(x) равна %f", x, y);
    }
}
