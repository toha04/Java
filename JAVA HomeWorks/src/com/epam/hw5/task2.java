package com.epam.hw5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int l = (int) (Math.random() * 11);

        System.out.println("Massive length:" + l);

        int[] myArray = new int[l];
        int positiveLength = 0, negativeLength = 0;

        for (int i = 0; i < l; i++) {
            myArray[i] = (int) (Math.random() * 200 - 100);
            if (myArray[i] >= 0){
                positiveLength++;
            }else {
                negativeLength++;
            }
        }
        int[] positiveArray = new int[positiveLength];
        int[] negativeArray = new int[negativeLength];

        int j = 0;
        int k = 0;
        for (int i = 0; i < l; i++) {
            if (myArray[i] >= 0){
                positiveArray[j] = myArray[i];
                j++;
            }else {
                negativeArray[k] = myArray[i];
                k++;
            }
        }
        System.out.println("Positive array:");
        for (int i = 0; i < positiveLength; i++) {
            System.out.println(positiveArray[i] + ",");
        }
        System.out.println("Negative array:");
        for (int i = 0; i < negativeLength; i++) {
            System.out.println(negativeArray[i] + ",");
        }
    }


}
