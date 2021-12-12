package com.services;

import com.library.Library;
import com.library.Reader;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ReaderServiceImpl implements ReaderService {
    private final Library library;

    @Override
    public List<Reader> getReaders() {
        return library.getReaders();
    }

    @Override
    public void addReaders(Reader reader) {
        library.getReaders().add(reader);
    }

    @Override
    public void addReaders(List<Reader> readers) {
        library.getReaders().addAll(readers);
    }

    @Override
    public boolean isReaderTookMoreThanOneBook(String emailAddress) {
        return library.getReaders().stream()
                .anyMatch(reader -> reader.getEmailAddress().equals(emailAddress) && reader.getBooks().size() > 1);
    }
}
