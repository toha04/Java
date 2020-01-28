package HW6;

import java.util.Scanner;

public class Books {
    private Book[] listOfBooks;
    private int counter;

    public Books(int length) {
        if (length >= 0) {
            listOfBooks = new Book[length];
        } else {
            System.out.println("Negative length of array");
            }
        }
    public void viewAllUnits() {
        for(Book unit : listOfBooks) {
            if (unit != null) {
                unit.view();
            }
        }
    }

    public void congestion(Book book) {
        if (listOfBooks.length > counter) {
            listOfBooks[counter] = book;
            counter++;
        } else {
            System.out.println("Array is overloaded");
        }
    }

    public void PriceDown() {
        Scanner sc = new Scanner(System.in);
        double percent = sc.nextDouble();
        for (Book unit : listOfBooks) {
            if (unit != null) {
                unit.setPrice(unit.getPrice() - unit.getPrice() * percent / 100);
            }
        }
    }

    public void PriceUp() {
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


