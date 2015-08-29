package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldWelcomeAUserWithAWelcomeMessage() {
        Library library = new Library();
        
        assertEquals("Welcome! Biblioteca is at your Service", library.welcome());
    }
}
