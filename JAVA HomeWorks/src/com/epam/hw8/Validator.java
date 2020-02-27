package com.epam.hw8;

public class Validator {
    public static boolean EmptyShelf(Book[] storage) {
        int counter = 0;
        for (Book elem : storage) {
            if (elem == null) {
                counter++;
            }
        }
        System.out.println("Storage is empty");
        return counter == storage.length;

    }
}
