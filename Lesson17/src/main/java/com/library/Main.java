package com.library;

import com.services.BookService;
import com.services.LibraryServiceImpl;
import com.services.ReaderService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Arthur Conan Doyle", "The White Company", 1891));
        books.add(new Book("George Orwell", "Two Wasted Years", 1943));
        books.add(new Book("Alexander Pushkin", "Ruslan i Ludmila", 1820));

        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Alex", "Alexeev", "alex@mail.ru", true));
        readers.add(new Reader("Petr", "Petrov", "petr@mail.ru", false));
        readers.add(new Reader("Ivan", "Ivanov", "ivan@gmail.com", true));

        Book book1 = new Book("Alexander Pushkin", "Ruslan i Ludmila", 1820);
        Book book = new Book("Jack London", "Martin Eden", 1909);
        Reader reader = new Reader("Pavel", "Pavlov", "pavel@mail.ru", false);

        Library library = new Library(books, readers);
        LibraryServiceImpl libraryServiceImpl = new LibraryServiceImpl(library);
        BookService bookService = libraryServiceImpl.getBookService();
        ReaderService readerService = libraryServiceImpl.getReaderService();

        System.out.println(libraryServiceImpl.getLibrary());
        System.out.println(bookService.sortedBooksByYear());
        bookService.addBooks(book);
        System.out.println(libraryServiceImpl.getLibrary());
        bookService.removeBookFromLibrary(book1);
        System.out.println(libraryServiceImpl.getLibrary());
        readerService.addReaders(reader);
        System.out.println(libraryServiceImpl.getAllEmailAddresses(readerService.getReaders()));
        System.out.println(libraryServiceImpl.getAgreementEmailAddresses(readerService.getReaders()));
        libraryServiceImpl.getBookToReader(new Book("Alexander Pushkin", "Ruslan i Ludmila", 1820), reader);
        libraryServiceImpl.getBookToReader(new Book("George Orwell", "Two Wasted Years", 1943), reader);
        System.out.println(bookService.findBooksByReader(reader));
        System.out.println(readerService.isReaderTookMoreThanOneBook("pavel@mail.ru"));
        System.out.println(libraryServiceImpl.getLibrary());
    }
}
