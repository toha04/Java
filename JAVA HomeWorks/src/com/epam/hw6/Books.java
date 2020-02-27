package com.epam.hw6;


public class Books {
    private Book[] storage;
    private int counter;

    public Books(int counter) {
        this.counter = counter;
        storage = new Book[counter];
    }

    public void length(int length) {
        if (length >= 0) {
            storage = new Book[length];
        } else {
            System.out.println("Negative length of the array");
        }
    }

    public Book[] getStorage() {
        return storage;
    }

    public int getCounter() {
        return counter;
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

    public void ChangePrice(char negativePositiveValue, double percent) {
        for (Book elem : storage) {
            if (elem != null) {
                double oldPrice = elem.getPrice();
                switch (negativePositiveValue) {
                    case '-':
                        elem.setPrice(oldPrice - oldPrice * percent / 100);
                        break;
                    case '+':
                        elem.setPrice(oldPrice + oldPrice * percent / 100);
                        break;
                }
            }
        }
    }

    public Books findOutAuthor(String author) {
        Books authors = new Books(counter);
        for (Book elem : storage) {
            if (elem != null && elem.getAuthor().equals(author)) {
                authors.addBook(elem);
            }
        }
        return authors;
    }

    public Books findOutYear(int num) {
        Books year = new Books(counter);
        for (Book elem : storage) {
            if (elem != null && elem.getYearOfPublication() > num) {
                year.addBook(elem);
            }
        }
        return year;
    }
}

