package com.epam.hw8;

import java.util.Comparator;

public class CompareByName implements Comparator<Book> {

    @Override
    public int compare (Book o1, Book o2) {
        if (o1 == null) {
            return (o2 == null) ? 0 : -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.getAuthor().compareTo(o2.getAuthor());

    }
}
