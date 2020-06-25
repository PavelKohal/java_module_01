package com.epamtc.java_online.module_01.condition;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить,
 * будут ли они расположены на одной прямой
 */

public class Task3 {

    public static void main(String[] args) {

        int x1, y1, x2, y2, x3, y3;
        int calculationResult;

        x1 = -1;
        y1 = 0;
        x2 = 2;
        y2 = 3;
        x3 = 10;
        y3 = 11;

        calculationResult = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);

        if (calculationResult == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
