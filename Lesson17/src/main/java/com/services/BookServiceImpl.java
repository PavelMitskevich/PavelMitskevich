package com.services;

import com.library.Book;
import com.library.Library;
import com.library.Reader;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final Library library;

    @Override
    public List<Book> sortedBooksByYear() {
        List<Book> booksByYear = library.getBooks();
        return booksByYear.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBooks() {
        return library.getBooks();
    }

    @Override
    public void addBooks(Book book) {
        library.getBooks().add(book);
    }

    @Override
    public void addBooks(List<Book> books) {
        library.getBooks().addAll(books);
    }

    @Override
    public void removeBookFromLibrary(Book book) {
        if (library.getBooks().stream()
                .anyMatch(b -> b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle()))) {
            List<Book> collect = library.getBooks().stream()
                    .filter(book1 -> !book1.getTitle().equals(book.getTitle()) && !book1.getAuthor().equals(book.getAuthor()))
                    .collect(Collectors.toList());
            library.setBooks(collect);
        }
    }

    @Override
    public List<Book> findBooksByReader(Reader reader) {
        return reader.getBooks();
    }
}
