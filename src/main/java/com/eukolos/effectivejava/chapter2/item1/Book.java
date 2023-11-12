package com.eukolos.effectivejava.chapter2.item1;

public class Book {

    String name;

    public static Book fantasyBook(String name) {
        return new Lotr();
    }

    public static Book horrorBook(String name) {
        return new It();
    }

}
