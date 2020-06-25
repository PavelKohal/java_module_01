package com.epamtc.java_online.module_01.condition;

/*
* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z
* кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {

    public static void main(String[] args) {

        int a, b, x, y, z;
        boolean isCrawling;

        a = 10;
        b = 10;
        x = 8;
        y = 12;
        z = 5;

        isCrawling = (x < a && y < b) || (x < b && y < a) ||
                (x < a && z < b) || (x < b && z < a) ||
                (y < a && z < b) || (y < b && z < a);

        if(isCrawling) {
            System.out.println("Кирпич проходит через отверстие");
        } else {
            System.out.println("Кирпич не проходит через отверстие");
        }
    }
}
