package com.epam.hw8;

import java.util.Scanner;

public class Books {
    private Book[] listOfBooks;
    private int counter;

    public Books(int length) {
        if (length >= 0) {
            listOfBooks = new Book[length];
        } else {
            System.out.println("Negative length of array. ");
        }
    }

    public void viewAllUnits() {
        for (Book unit : listOfBooks) {
            if (unit != null) {
                System.out.println(unit.toString());
            }
        }
    }

    public void congestion(Book book) {
        if (listOfBooks.length > counter) {
            listOfBooks[counter] = book;
            counter = counter + 1;
        } else {
            System.out.println("Full library ");
        }
    }

    public void priceDown() {
        Scanner sc = new Scanner(System.in);
        double percent = sc.nextDouble();
        for (Book unit : listOfBooks) {
            if (unit != null) {
                unit.setPrice(unit.getPrice() - unit.getPrice() * percent / 100);
            }
        }
    }

    public void priceUp() {
        Scanner sc = new Scanner(System.in);
        double percent = sc.nextDouble();
        for (Book unit : listOfBooks) {
            if (unit != null) {
                unit.setPrice(unit.getPrice() + unit.getPrice() * percent / 100);
            }
        }
    }

    public Books findOutYear() {
        int counter = 0;
        Books books = new Books(listOfBooks.length);
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        for (Book unit : listOfBooks) {
            if (unit != null && unit.getYearOfPublication() >= year) {
                books.congestion(unit);
            }
            if (unit == null) {
                counter++;
                if (counter == listOfBooks.length) {
                    System.out.println("Emptiness");
                }
            }
        }
        return books;
    }
    public Books findOutAuthor() {
        Books books = new Books(listOfBooks.length);
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();
        for (Book unit : listOfBooks) {
            if (unit != null && unit.getAuthor().equals(author)) {
                books.congestion(unit);
            }
            if (unit == null) {
                counter++;
                if (counter == listOfBooks.length) {
                    System.out.println("Emptiness");
                }
            }
        }
        return books;
    }
}
