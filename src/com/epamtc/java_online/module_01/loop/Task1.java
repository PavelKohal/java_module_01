package com.epamtc.java_online.module_01.loop;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int num;
        int sum;

        Scanner scan = new Scanner(System.in);
        sum = 0;

        System.out.print("Введите целое положительное число: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Введите целое положительное число: ");
        }
        num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.printf("Сумма чисел от 1 до %d равна %d", num, sum);
    }
}
