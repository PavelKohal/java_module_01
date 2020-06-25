package com.epamtc.java_online.module_01.loop;

/*
 * Даны 2 числа. Определить цифры, входящие в
 * запись как первого, так и второго числа.
 */

public class Task8 {

    public static void main(String[] args) {

        int firstNum;
        int secondNum;
        int index;
        String resultString;
        boolean isRepeatedDigit;

        firstNum = 512345;
        secondNum = 34567;
        index = 0;
        resultString = "";

        char[] digitArray1;
        char[] digitArray2;
        digitArray1 = Integer.toString(firstNum).toCharArray();
        digitArray2 = Integer.toString(secondNum).toCharArray();

        int count = 0;

        //считаем количество повторяющихся цифр
        for (int i = 0; i < digitArray1.length; i++) {
            for (int j = 0; j < digitArray2.length; j++) {
                if (digitArray1[i] == digitArray2[j]) {
                    count++;
                }
            }
        }

        //массив, в котором хранятся все повторяющиеся цифры (с повторениями)
        char [] repeatArray = new char[count];

        for (int i = 0; i < digitArray1.length; i++) {
            for(int j = 0; j < digitArray2.length; j++) {
                if(digitArray1[i] == digitArray2[j]) {
                    repeatArray[index] = digitArray1[i];
                    index++;
                }
            }
        }

        //цифры в обоих числах без повторений
        for(int i = 0; i <repeatArray.length; i++) {
            isRepeatedDigit = false;
            for(int j = i+1; j< repeatArray.length; j++) {
                if(repeatArray[i] == repeatArray[j]) {
                    isRepeatedDigit = true;
                    break;
                }
            }
            if(!isRepeatedDigit) {
                resultString +=repeatArray[i] + " ";
            }
        }

        System.out.print("Цифры, входящие в состав как первого, так и второго числа: " + resultString);
    }
}
