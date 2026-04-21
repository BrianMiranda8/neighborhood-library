package org.example.interfaces;

import org.example.models.Book;

import java.util.List;

public interface BookRepository {

    void addBook(Book book);
    Book getBookByTitle(String title);
    void updateBook(String isbn, Book book);
    void checkOutBook(String isbn, String user);
    void checkOUtBookByTitle(String title, String user);
    List<Book> listBooks();

}
