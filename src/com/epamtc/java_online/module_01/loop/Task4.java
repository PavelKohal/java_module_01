package com.epamtc.java_online.module_01.loop;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

import java.math.BigInteger;

public class Task4 {

    public static void main(String[] args) {

        BigInteger varNumber = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            varNumber = varNumber.multiply(BigInteger.valueOf(i * i));
        }

        System.out.println("Произведение квадратов первых двухсот чисел равно: " + varNumber);
    }
}
