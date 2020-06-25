package com.epamtc.java_online.module_01.linear;

/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (sin(x)+cos(y))/(cos(x)-sin(y))*tg(xy).
 */

public class Task3 {

    public static void main(String[] args) {

        double x;
        double y;
        double result;

        x = Math.toRadians(34.3);
        y = Math.toRadians(48.6);
        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.printf("Результат: %.2f", result);
    }
}
