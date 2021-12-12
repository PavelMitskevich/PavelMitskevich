package com.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (readers == null) {
            readers = new ArrayList<>();
        }
        return readers;
    }

    @Override
    public String toString() {
        return "Books = " + books +
                ", readers=" + readers;
    }
}
