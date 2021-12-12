package com.services;

import com.library.Book;
import com.library.Reader;

import java.util.List;

public interface BookService {
    List<Book> sortedBooksByYear();

    List<Book> getBooks();

    void addBooks(Book book);

    void addBooks(List<Book> books);

    void removeBookFromLibrary(Book book);

    List<Book> findBooksByReader(Reader reader);
}
