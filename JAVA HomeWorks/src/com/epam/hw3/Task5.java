package com.epam.hw3;


public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 2) {
            a++;
            int num = 9;
            int z = 1;
            int i = 0;
            while (i < num / 2 + 1) {
                i++;
                int num2 = (num - z) / 2;
                int j = 0;
                while (j < num2) {
                    j++;
                    System.out.print("   ");
                }
                int k = 0;
                while (k < z) {
                    k++;
                    System.out.print("*  ");
                }
                System.out.println();

                z = z + 2;

            }
        }
    }
    }
