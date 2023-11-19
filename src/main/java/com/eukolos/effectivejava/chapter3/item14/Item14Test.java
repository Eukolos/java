package com.eukolos.effectivejava.chapter3.item14;

import java.util.ArrayList;
import java.util.Collections;

public class Item14Test {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("Lotr", 500));
        bookList.add(new Book("Narnia", 200));
        bookList.add(new Book("Eragon", 350));

        Collections.sort(bookList);

        System.out.println("Sıralama1");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }

        // Sıralama 2
        System.out.println("Sıralama2");
        NameCompare ismeGöre = new NameCompare();
        Collections.sort(bookList, ismeGöre);
        for (Book book : bookList) {
            System.out.println(book.toString());
        }


    }

}
