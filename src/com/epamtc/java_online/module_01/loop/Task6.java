package com.epamtc.java_online.module_01.loop;

/*
 * Вывести на экран соответствие между символами и их
 * численными обозначениями в памяти компьютера.
 */

public class Task6 {

    public static void main(String[] args) {

        for (int i = 33; i <= 126; i++) {
            System.out.println(i + "-й символ - " + (char) i);
        }
    }
}
