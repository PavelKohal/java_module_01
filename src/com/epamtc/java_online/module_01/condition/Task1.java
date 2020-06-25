package com.epamtc.java_online.module_01.condition;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли
 * такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task1 {

    public static void main(String[] args) {

        int angleA;
        int angleB;
        int angleC;

        angleA = 60;
        angleB = 30;
        angleC = angleA - angleB;

        if ((angleA + angleB) < 180 && angleA > 0 && angleB > 0) {
            System.out.println("Треугольник существует");
            if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не является прямоугольным");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
