package com.services;

import com.library.Book;
import com.library.Library;
import com.library.Reader;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class LibraryServiceImpl implements LibraryService {
    private final Library library;
    private final BookService bookService;
    private final ReaderService readerService;

    public LibraryServiceImpl(Library library) {
        this.library = library;
        this.bookService = new BookServiceImpl(library);
        this.readerService = new ReaderServiceImpl(library);
    }

    @Override
    public List<String> getAllEmailAddresses(List<Reader> readers) {
        return readers.stream()
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAgreementEmailAddresses(List<Reader> readers) {
        return readers.stream()
                .filter(Reader::isAgreementForMailing)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    @Override
    public void getBookToReader(Book book, Reader reader) {
        if (library.getReaders().stream()
                .noneMatch(reader1 -> reader1.getName().equals(reader.getName()))) {
            readerService.addReaders(reader);
        }
        reader.getBooks().add(book);
        if (library.getBooks().stream()
                .anyMatch(b -> b.getAuthor().equals(book.getAuthor()))) {
            List<Book> collect = library.getBooks().stream()
                    .filter(book1 -> !book1.getTitle().equals(book.getTitle()))
                    .collect(Collectors.toList());
            library.setBooks(collect);
        }
        System.out.println(reader);
    }

    @Override
    public boolean isReaderTookMoreThanOneBook(String emailAddress) {
        return library.getReaders().stream()
                .anyMatch(reader -> reader.getEmailAddress().equals(emailAddress));
    }
}
