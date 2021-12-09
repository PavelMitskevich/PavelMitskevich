package com.services;

import com.library.Reader;

import java.util.List;

public interface ReaderService {
    List<Reader> getReaders();

    void addReaders(Reader reader);

    void addReaders(List<Reader> readers);

    boolean isReaderTookMoreThanOneBook(String emailAddress);
}
