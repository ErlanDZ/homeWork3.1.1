package com.example.homework311;

import java.util.ArrayList;
import java.util.List;

public class Stringh {
    public static ArrayList<BooksModels> bookList = new ArrayList<>();

    public static BooksModels getBookByPosition(int position){
        return bookList.get(position);
    }


    public static List<BooksModels> getBookList(){
        bookList.add(new BooksModels("Январь"));
        bookList.add(new BooksModels("Февраль"));
        bookList.add(new BooksModels("Март"));
        bookList.add(new BooksModels("Апрель"));
        bookList.add(new BooksModels("Май"));
        bookList.add(new BooksModels("Июнь"));
        bookList.add(new BooksModels("Июль"));
        bookList.add(new BooksModels("Август"));
        bookList.add(new BooksModels("Сентябрь"));
        bookList.add(new BooksModels("Октябрь"));
        bookList.add(new BooksModels("Ноябрь"));
        bookList.add(new BooksModels("Декабрь"));

        return bookList;
    }
}
