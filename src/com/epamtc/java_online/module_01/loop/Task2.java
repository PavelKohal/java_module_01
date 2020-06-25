package com.epamtc.java_online.module_01.loop;

/*
 * Вычислить значения функции на отрезке [a, b] с шагом h:
 * y = x, если x>2; y = -x, если x<=2.
 */

public class Task2 {

    public static void main(String[] args) {

        double a;
        double b;
        double h;

        a = -1;
        b = 3;
        h = 0.3;

        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                System.out.printf("В точке %.1f значение функции равно %.1f\n", x, x);
            } else {
                System.out.printf("В точке %.1f значение функции равно %.1f\n", x, -x);
            }
        }
    }
}
