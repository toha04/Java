package com.epam.hw2;
import java.util.Scanner;

public class HW2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three-digit number");
        int number = sc.nextInt();

        int num1 = ((number % 10)*100);
        int num2 = (((number % 100) / 10)*10);
        int num3 = (number / 100);
        int sum = (num1 + num2 +num3);

        System.out.println(sum - number);
    }
}
