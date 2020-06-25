package com.epamtc.java_online.module_01.linear;

/*
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.print("Введите значение a: ");
        }
        a = scan.nextDouble();

        System.out.print("Введите значение b: ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.print("Введите значение b: ");
        }
        b = scan.nextDouble();

        System.out.print("Введите значение c: ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.print("Введите значение c: ");
        }
        c = scan.nextDouble();

        z = ((a - 3) * b / 2) + c;

        System.out.printf("Результат: %.1f", z);
    }
}
