package com.epam.hw8;
import java.util.Arrays;
public class Books implements Cloneable {
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

    public void viewAllElements() throws EmptyArrayException{
        if(Validator.EmptyShelf(storage)) {
            throw new EmptyArrayException("Empty shelf!");
        }
        for (Book elem : storage) {
            if (elem == null) {
                break;
            }
            System.out.println(elem.toString());
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
    @Override
    public Books clone () throws CloneNotSupportedException {
        Books clone = (Books)super.clone();
        clone.storage = Arrays.copyOf(storage, storage.length);
        return clone;
    }
    public void getAuthorsNameCompared() {
        Arrays.sort(storage, new CompareByName());
    }
    public void getPublishersNameCompared() {
        Arrays.sort(storage, new CompareByPublishingHouse());
    }
    public void getPriceCompared() {
        Arrays.sort(storage, new CompareByPrice());
    }
}


