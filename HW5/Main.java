package HW5;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print arrays length:");
        int l = sc.nextInt();
        System.out.println(String.format("Print second %s-digit array: ", l));
        int[] array1 = new int[l];
        int[] array2 = new int[l];
        for (int i = 0; i < l; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(String.format("Print second %s-digit array: ", l));
        for (int i = 0; i < l; i++) {
            array2[i] = sc.nextInt();
        }
        int[] array3 = new int[l];
        System.out.println("Result:");
        for (int i = 0; i < l; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i]);
        }
    }
}