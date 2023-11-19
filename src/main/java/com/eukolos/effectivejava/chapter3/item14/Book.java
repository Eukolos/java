package com.eukolos.effectivejava.chapter3.item14;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book implements Comparable<Book>{

    private String name;
    private int page;

    public Book(String name, int page) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.page = page;
    }



    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return this.page - o.page;
    }

    @Override
    public String toString() {
        return "Kitap [isim=" + name + ", sayfa=" + page + "]";
    }

}