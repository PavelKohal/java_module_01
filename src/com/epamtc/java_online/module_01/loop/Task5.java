package com.epamtc.java_online.module_01.loop;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех
 * членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид an = 1/2^n + 1/3^n.
 */

public class Task5 {

    public static void main(String[] args) {

        int numberRowLength;
        double e;
        double a;
        double sumRowElements;

        numberRowLength = 10;
        e = 0.5;
        sumRowElements = 0;

        for (int i = 1; i <= numberRowLength ;i++) {
            a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if(Math.abs(a) >= e) {
                sumRowElements += a;
            }
        }

        System.out.printf("Сумма членов ряда, модуль которых >= %f, равна %f", e, sumRowElements);
    }
}
