package com.example.homework311;

import java.io.Serializable;

public class BooksModels implements Serializable {
    private String bookName;

    public BooksModels(String bookName) {
        this.bookName = bookName;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


}