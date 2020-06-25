package com.epamtc.java_online.module_01.linear;

/*
 * Дано натуральное число T, которое представляет длительность
 * прошедшего времени в сукундах. Вывести данное значение длительности в
 * часах, минутах и секундах в следующей форме: HHч MMм SSс.
 */

public class Task5 {

    public static void main(String[] args) {

        int t;
        int hours;
        int minutes;
        int seconds;

        t = 35678;
        hours = t / 3600;
        minutes = (t - hours * 3600) / 60;
        seconds = t % 60;

        System.out.printf("%02dh %02dm %02ds", hours, minutes, seconds);
    }
}
