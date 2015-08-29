package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private List<Book> books;

    @Before
    public void setUp() {
        books = new ArrayList<Book>();
        books.add(new Book("Anna Karenina", "Leo Tolstoy", (short) 1878));
        books.add(new Book("Madame Bovary", "Gustave Flaubert", (short)1856));
        books.add(new Book("War and Peace", "Leo Tolstoy", (short)1869));
        books.add(new Book("Lolita", "Vladimir Nabokov", (short)1955));
        books.add(new Book("The Adventures of Huckleberry Finn","Mark Twain",(short)1884));
        books.add(new Book("Hamlet", "William Shakespeare", (short) 1599));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", (short)1925));
        books.add(new Book("In Search of Lost Time", "Marcel Proust", (short)1871));
        books.add(new Book("The Stories of Anton Chekhov", "Anton Chekhov", (short)1900));
        books.add(new Book("Middlemarch","George Eliot",(short)1871));
        library = new Library(books);
    }

    @Test
    public void shouldHaveSomeBooksAvailable() {
        assertEquals(false, library.listBooks().isEmpty());
    }

    @Test
    public void shouldHaveAllTenBooksInitiallyAdded() {
        assertEquals(books,library.listBooks());
    }
}
