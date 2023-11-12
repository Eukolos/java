package com.eukolos.effectivejava.chapter2.item1;

public class Library {

    private final String bookName;
    private int bookPage;

    public Library(String bookName, int bookPage) {

        this.bookName = bookName;
        this.bookPage = bookPage;
    }

    public Library(String bookName) {
        this.bookName = bookName;
    }


    public static Library addBook(String bookName)
    {
        return new Library(bookName, 22);
    }

}