package org.example;

import org.example.interfaces.BookRepository;
import org.example.models.Book;
import org.example.repository.InMemoryBookRepository;

import java.util.ArrayList;

public class Library {

    BookRepository BookRepository = new InMemoryBookRepository();

    public Library(){

    }

    public  void showCheckedOutBooks() {

        for (Book book : this.BookRepository.showBooks()){
            if (book.isCheckedOut()){
                IO.println(book);
            }
        }


    }

    public  void showAvailableBooks() {

        for (Book book : this.BookRepository.showBooks()){
            IO.println(book);
        }
    }

    private void setBookHeader(){

    }

    public void checkOutBook() {
        boolean stillGoingFlag = true;
        UI.setMessage("Select If You Want To Find Book Via Title Or ISBN", false);
        String userOption = UI.getUserInput("1) Checkout By Title \n" +
                "2) Checkout by ISBN \n" +
                "3) Exit \n" +

                "Make Selection: ");

        while (stillGoingFlag){

        }


    }
}
