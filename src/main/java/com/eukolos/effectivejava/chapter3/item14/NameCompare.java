package com.eukolos.effectivejava.chapter3.item14;

import java.util.Comparator;

public class NameCompare implements Comparator<Book> {

    public int compare(Book m1, Book m2) {
        return m1.getName().compareTo(m2.getName());
    }

}