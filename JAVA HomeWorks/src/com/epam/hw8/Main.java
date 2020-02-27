package com.epam.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);

        Books storage = new Books(9);
        storage.addBook(new Book(1, "A Game of Thrones", "George R. R. Martin", 1996, 694, 694, "Harper Voyager "));
        storage.addBook(new Book (2, "A Clash of Kings", "George R. R. Martin", 1999, 768, 768, "Harper Voyager "));
        storage.addBook(new Book (3, "A Storm of Swords", "George R. R. Martin", 2000, 973, 973, "Harper Voyager "));
        storage.addBook(new Book (4, "A Feast for Crows", "George R. R. Martin", 2005, 753, 753, "Harper Voyager "));
        storage.addBook(new Book (5, "A Dance with Dragons", "George R. R. Martin", 2011, 1056, 1056, "Harper Voyager "));

        Menu menu = new Menu(storage);

        try {

            menu.menuMain();
            System.out.println(storage.toString());

        } catch (NullPointerException | EmptyArrayException e) {
            System.out.println("Found an error!");
        }

//        System.out.println("Enter percent to increase or decrease the price");
//        String str = sc.nextLine();
//        char[] strArr = str.toCharArray();
//        try {
//            char sign = strArr[0];
//            double percent = Double.parseDouble(String.valueOf(Arrays.copyOfRange(strArr, 1, strArr.length)));
//            storage.ChangePrice(sign, percent);
//            storage.viewAllElements();
//
//        }catch(NumberFormatException e){
//            System.err.println("You should enter correct value <+ or -><number>");
//        }
//
//        System.out.println("Enter author's name: ");
//        String author = sc.nextLine();
//        storage.findOutAuthor(author).viewAllElements();
//
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//        storage.findOutYear(year).viewAllElements();


    }
}
