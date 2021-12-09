package com.library;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Reader {
    private String name;
    private String surname;
    private String emailAddress;
    private boolean agreementForMailing;
    private List<Book> books;

    public Reader(String name, String surname, String emailAddress, boolean agreementForMailing) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.agreementForMailing = agreementForMailing;
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress=" + emailAddress + '\'' +
                ", agreementForMailing=" + agreementForMailing + '\'' +
                ", borrowed books: " + books;
    }
}
