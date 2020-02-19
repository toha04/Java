package com.epam.hw6;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Books storage = new Books(9);
        storage.addBook(new Book(1, "A Game of Thrones", "George R. R. Martin", 1996, 694, 694, "Harper Voyager "));
        storage.addBook(new Book (2, "A Clash of Kings", "George R. R. Martin", 1999, 768, 768, "Harper Voyager "));
        storage.addBook(new Book (3, "A Storm of Swords", "George R. R. Martin", 2000, 973, 973, "Harper Voyager "));
        storage.addBook(new Book (4, "A Feast for Crows", "George R. R. Martin", 2005, 753, 753, "Harper Voyager "));
        storage.addBook(new Book (5, "A Dance with Dragons", "George R. R. Martin", 2011, 1056, 1056, "Harper Voyager "));

        System.out.println("Enter percent to increase the price");
        int percent = sc.nextInt();
        storage.changePriceUp(percent);
        storage.viewAllElements();
        System.out.println("Enter author's name: ");
        storage.findOutAuthor("George R. R. Martin").viewAllElements();



//        books.priceUp();
//        books.viewAllUnits();
//        System.out.println("Enter percent to decrease the price");
//        books.priceDown();
//        books.viewAllUnits();
//        System.out.println("Enter author's name: ");
//        books.findOutAuthor().viewAllUnits();
//        System.out.println("Enter year: ");
//        books.findOutYear().viewAllUnits();

    }
}
