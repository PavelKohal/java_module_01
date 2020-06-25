package com.epamtc.java_online.module_01.loop;

/*
 * Вывести на экран соответствие между символами и их
 * численными обозначениями в памяти компьютера.
 */

public class Task6 {

    public static void main(String[] args) {

        String str = "java";

        System.out.printf("Численное обозначение символов, входящих строку %s: \n", str);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.codePointAt(i) + " ");
        }
    }
}
