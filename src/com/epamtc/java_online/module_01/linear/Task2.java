package com.epamtc.java_online.module_01.linear;

/*
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (b + Math.sqrt(b^2 + 4*a*c)) / 2*a - (a^3)*c + b^(-2).
 */

public class Task2 {

    public static void main(String[] args) {

        double a = 2.5;
        double b = 3.1;
        double c = 4.0;
        double result;

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("Результат: %.2f", result);
    }
}
