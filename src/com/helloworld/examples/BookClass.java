package com.helloworld.examples;

public class BookClass {

    public static void main(String[] args) {

        Book theBook = new Book("UTGERGW87", "The Book", 270);

        System.out.println(theBook.isbn);

    }

    static class Book {
        String isbn = "";
        String title = "";
        int pages = 0;

        public Book(String isbn, String title, int pages) {
            this.isbn = isbn;
            this.title = title;
            this.pages = pages;
        }
    }
}
