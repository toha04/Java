package com.epam.hw8;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1 == null) {
            return (o2 == null) ? 0 : -1;
        }
        if (o2 == null) {
            return 1;
        }
        return ((int)o1.getPrice() - (int)o2.getPrice());
    }
}

