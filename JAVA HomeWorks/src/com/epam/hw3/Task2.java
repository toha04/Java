package com.epam.hw3;

public class Task2 {
    public static void main(String[] args) {
        int count = 7;
        int i = 7;
        while ( i <= count ) {
            i--;
            int j = 1;
            while ( j <  count - i) {
                j++;
                System.out.print("  ");
            }
            int count2 = (j = i);
            while ( j > 0) {
                j--;
                System.out.print("* ");
            }
            System.out.println();
            if ( i == 0 ) {
                break;
            }
        }
    }
}
