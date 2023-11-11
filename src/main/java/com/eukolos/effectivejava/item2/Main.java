package com.eukolos.effectivejava.item2;

public class Main {

        public static void main(String[] args) {
            BookBuilder book = new BookBuilder.Builder()
                    .title("The Lord of the Rings")
                    .author("J. R. R. Tolkien")
                    .pageCount(1178)
                    .build();
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getPageCount());
        }
}
