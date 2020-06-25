package com.epamtc.java_online.module_01.loop;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все
 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int m;
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите начало отрезка m: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Введите начало отрезка m: ");
        }
        m = scan.nextInt();

        System.out.print("Введите конец отрезка n: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Введите конец отрезка n: ");
        }
        n = scan.nextInt();

        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        for (int i = m; i <= n; i++) {

            System.out.printf("\nДелители для числа %d: ", i);

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.printf("%d  ", j);
                }
            }
        }
    }
}
