package com.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String author;
    private String title;
    private int year;

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year;
    }
}
