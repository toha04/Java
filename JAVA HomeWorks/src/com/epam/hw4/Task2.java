package com.epam.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(intoBinary(n));

    }
    public static String intoBinary(int n) {

        String x = "";

        while (n > 0) {
            int a = n % 2;
             x = a + x;
             n = n / 2;
        }
        return x;
        }
    }

