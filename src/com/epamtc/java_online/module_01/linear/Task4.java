package com.epamtc.java_online.module_01.linear;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда
 * в дробной и целой частях). Поменять местами дробную и целую части
 * числа и вывести полученное значение числа.
 */

public class Task4 {

    public static void main(String[] args) {

        double r;
        int integerPart;
        double fractalPart;
        double result;

        r = 234.893;
        integerPart = (int)r;
        fractalPart = r - integerPart;
        result = 1000 * fractalPart + (double)integerPart / 1000;

        System.out.printf("Результат: %.3f", result);
    }
}
