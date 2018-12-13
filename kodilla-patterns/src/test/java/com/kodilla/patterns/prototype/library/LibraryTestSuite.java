package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        //Creating books and adding to library.
        Library library = new Library("My Collection");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n -> library.getBooks().add(new Book("Book nr " + n, "John Smith" + n, LocalDate.of(1990, 12, n))));

        //Shallow Copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Backup copy of my collection #1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep Copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Backup copy of my collection");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(new Book("Book nr 1", "John Smith1",LocalDate.of(1990,12,1)));
        //Then
        Assert.assertEquals(19, library.getBooks().size());
        Assert.assertEquals(19, clonedLibrary.getBooks().size());
        Assert.assertEquals(20, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
