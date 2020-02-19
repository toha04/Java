package com.epam.hw6;

import java.util.Scanner;

public class Books {
    private Book[] storage;
    private int counter;

    public Books(int counter) {
        this.counter = counter;
        storage = new Book[counter];
    }

    public int getCounter() {
        return counter;
    }


    public Book[] getStorage() {
        return storage;
    }

    public void addBook(Book book) {
        for (int count = 0; count < storage.length; count++) {
            if (storage[count] == null) {
                storage[count] = book;
                break;

            }
        }
    }

    public void viewAllElements() {
        for (Book elem : storage) {
            if (elem == null) {
                break;
            }
            elem.view();
        }
    }

    public void changePriceUp(int percent) {
        double newPercent = percent * 0.01;
        for (int count = 0; count < storage.length; count++) {
            if (storage[count] == null) {
                break;
            }
            double oldPrice = storage[count].getPrice();
            double newPrice = oldPrice + oldPrice * newPercent;
            storage[count].setPrice(newPrice);
        }
    }

    public Books findOutAuthor(String author) {
        Books authors = new Books(counter);

        int AuthorsInMass = 0;
        for (int count = 0; count < storage.length; count++) {
            if (storage[count] == null) {
                break;
            }

            String person = storage[count].getAuthor();
            if (person.equals(author)) {
                authors.storage[AuthorsInMass] = storage[count];
                AuthorsInMass++;
            } else {
                continue;
            }

        }
        return authors;
    }
}
