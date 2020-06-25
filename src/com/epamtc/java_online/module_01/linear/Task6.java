package com.epamtc.java_online.module_01.linear;

/*
 * Для данной области составить линейную прорамму, которая
 * печатает true, если точка с координатами (x, y) принадлежит
 * закрашенной области, и false - в противном случае.
 */

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int x;
        int y;
        boolean isBelong;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Введите значение x: ");
        }
        x = scan.nextInt();

        System.out.print("Введите значение y: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Введите значение y: ");
        }
        y = scan.nextInt();

        isBelong = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0);

        if (isBelong) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
