package com.epam.hw2;
import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Invest your sum");
        float invest = sc.nextFloat();
        System.out.println("How long?");
        int month = sc.nextInt();
        System.out.println("Your deposit on 12 % / year");

        float deposit = ((((12F /100F) / 12f) * invest) * month );
        System.out.println("Your total sum will be : " + deposit);



    }
}
