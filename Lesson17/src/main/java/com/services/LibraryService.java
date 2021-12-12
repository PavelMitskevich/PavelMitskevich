package com.services;

import com.library.Book;
import com.library.Reader;

import java.util.List;

public interface LibraryService {
    List<String> getAllEmailAddresses(List<Reader> readers);

    List<String> getAgreementEmailAddresses(List<Reader> readers);

    void getBookToReader(Book book, Reader reader);

    boolean isReaderTookMoreThanOneBook(String emailAddress);
}
