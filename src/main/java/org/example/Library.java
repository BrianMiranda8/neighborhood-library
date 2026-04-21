package org.example;

import org.example.interfaces.BookRepository;
import org.example.models.Book;
import org.example.repository.InMemoryBookRepository;

public class Library {

    BookRepository BookRepository = new InMemoryBookRepository();

    public Library(){

    }

    public  void showCheckedOutBooks() {

        for (Book book : this.BookRepository.listBooks()){
            if (book.isCheckedOut()){
                IO.println(book);
            }
        }


    }

    public  void showAvailableBooks() {

        for (Book book : this.BookRepository.listBooks()){
            IO.println(book);
        }
    }



    public void checkOutBook() {

        boolean checkoutBookFlag = true;
        UI.setMessage("Select If You Want To Find Book Via Title Or ISBN", false);

        while (checkoutBookFlag){

            String userOption = UI.getUserInput( "-------------- Checkout Book ---------------"+
                    "    1) Checkout By Title \n" +
                    "    2) Checkout by ISBN \n" +
                    "    3) Exit \n" +
                    "Make Selection: ");

            switch (userOption){

                case "1" -> checkOutByTitle();
                case "2" -> checkoutByISBN();
                case "3" -> checkoutBookFlag = false;
                default -> UI.setMessage("Invalid selection try again ", false);

            }
        }

    }


    // done
    private void checkOutByTitle(){
        String userNameInput = UI.getUserInput("Enter Name: ");
        if(userNameInput.isBlank()){
            UI.setMessage("Name needs to be entered", false);
            return;
        }
        String userInput = UI.getUserInput("Enter Title: ");

        for (Book book : BookRepository.listBooks()){
            if(book.getTitle().equals(userInput)){
                UI.setMessage(book.getTitle() + " has been checkout out to " + userNameInput,false);
                return;
            }
        }

    }
    private void checkoutByISBN(){
        String userNameInput = UI.getUserInput("Enter Name: ");
        if(userNameInput.isBlank()){
            UI.setMessage("Name needs to be entered", false);
            return;
        }
        String userInput = UI.getUserInput("Enter ISBN: ");

        for (Book book : BookRepository.listBooks()){
            if(book.getIsbn().equals(userInput) && book.isCheckedOut()){
                UI.setMessage(book.getTitle() + " has been checkout out to " + userNameInput,false);
                return;
            }
        }

    }
}
