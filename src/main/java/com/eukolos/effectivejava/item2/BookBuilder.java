package com.eukolos.effectivejava.item2;

public class BookBuilder {
    private String title;
    private String author;
    private int pageCount;

    private BookBuilder(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pageCount = builder.pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public static class Builder {
        private String title;
        private String author;
        private int pageCount;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder pageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public BookBuilder build() {
            return new BookBuilder(this);
        }
    }
}
