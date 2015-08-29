package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldBeAbleToGetCheckedOut() {
        Book book =  new Book("Anna Karenina", "Leo Tolstoy", (short) 1878);

        assertEquals(true, book.checkoutBook());
    }

    @Test
    public void shouldNotBeAbleToGetCheckedOutIfItIsAlreadyCheckedOut() {
        Book book =  new Book("Anna Karenina", "Leo Tolstoy", (short) 1878);
        book.checkoutBook();

        assertEquals(false, book.checkoutBook());
    }
}
