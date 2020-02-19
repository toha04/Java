package com.epam.hw2;
import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("menu\t");
        System.out.println("1. pounds to kg");
        System.out.println("2. kg to pounds");
        int n=sc.nextInt();
        System.out.println("enter data for conversion");
        float d=sc.nextFloat();
        String st="";
        float result=1;
        if(n==1)
        {result=d*0.4536f;
            st="kg";}
        else
        {  result=d*2.2046f;
            st="lbs";}
        System.out.println("after conversion: "+result+" "+st);

        float sum = result;
        System.out.println("Integer" + " " + (int)sum + ", " + "float" + " " + (sum - (int)sum));


    }
}
