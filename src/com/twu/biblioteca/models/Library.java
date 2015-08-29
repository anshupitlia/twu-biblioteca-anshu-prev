package com.twu.biblioteca.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> listBooks() {
        return this.books;
    }
}
