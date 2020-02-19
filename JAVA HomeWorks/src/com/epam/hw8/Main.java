package com.epam.hw8;

public class Main {
    public static void main(String[] args) {

        Books books = new Books(5);
        books.congestion(new Book(1, "The Grand Design", "Stephen Hawking", 2015, 406, 256, "Bantam"));
        Book book = new Book(2, "SuperHuman Encyclopedia", "Robert Winston", 2014, 256  , 250, "Random House");
        books.congestion(book);
        books.congestion(new Book(3, "Think of Number. Can You Feel the Force? What Makes Me Me?", "Johnny Ball", 2008, 777, 250, "Reader's Digest"));
        System.out.println("Enter percent to increase the price");
        books.priceUp();
        books.viewAllUnits();
        System.out.println("Enter percent to decrease the price");
        books.priceDown();
        books.viewAllUnits();
        System.out.println("Enter author's name: ");
        books.findOutAuthor().viewAllUnits();
        System.out.println("Enter year: ");
        books.findOutYear().viewAllUnits();

    }


}
