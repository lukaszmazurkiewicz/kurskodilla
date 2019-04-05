package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("John Doe", "Neverland", 2000, "123"));
        books.add(new Book("Jane Jade", "Don't", 1998, "345"));
        books.add(new Book("Bob Bell", "Stop", 1965, "456"));
        books.add(new Book("Kim Kong", "Jazz",2001, "101"));
        books.add(new Book("Larry", "Lorry",2010, "234"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Given
        System.out.println(median);
        assertEquals(2000, median);
    }

}