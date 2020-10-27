package com.filemanager;

public class Document {

    // This should work for all documents
    public void print () {
        System.out.println("You printed a Document.");
    }

    // This is just laziness, hahaha...

    static class Word extends Document {

        private int pages;

        Word(int pages) {
            this.pages = pages;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public void print () {
            System.out.println("You printed " + this.pages + " Pages.");
        }
    }

    static class Excel extends Document {

        private int sheets;

        Excel(int sheets) {
            this.sheets = sheets;
        }

        public int getSheets() {
            return sheets;
        }

        public void setSheets(int sheets) {
            this.sheets = sheets;
        }

        public void print () {
            System.out.println("You printed " + this.sheets + " Sheets.");
        }

    }

    static class PDF extends Document {

        private String author;

        PDF(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void print () {
            System.out.println("You printed a PDF by " + this.author);
        }

    }

}
