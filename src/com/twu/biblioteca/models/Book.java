package com.twu.biblioteca.models;

public class Book {
    private String name;
    private String author;
    private short year;
    private boolean isAvailable;

    public Book(String name, String author, short year) {
        this.name = name;
        this.author = author;
        this.year = year;
        isAvailable = true;
    }

    public boolean checkoutBook() {
        return true;
    }
}
