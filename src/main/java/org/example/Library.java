package org.example;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> inventory = new ArrayList<>();

    public Library(){
        inventory.add(new Book(1, "978-0141439518", "Pride and Prejudice", "", false));
        inventory.add(new Book(2, "978-0451524935", "1984", "Winston Smith", true));
        inventory.add(new Book(3, "978-0060850524", "Brave New World", "", false));
        inventory.add(new Book(4, "978-0316769174", "The Catcher in the Rye", "Holden Caulfield", true));
        inventory.add(new Book(5, "978-0743273565", "The Great Gatsby", "", false));
        inventory.add(new Book(6, "978-0486280615", "Adventures of Huckleberry Finn", "", false));
        inventory.add(new Book(7, "978-0061120084", "To Kill a Mockingbird", "Atticus Finch", true));
        inventory.add(new Book(8, "978-0544003415", "The Lord of the Rings", "", false));
        inventory.add(new Book(9, "978-0142437230", "Moby Dick", "Ishmael", true));
        inventory.add(new Book(10, "978-0451526342", "Animal Farm", "", false));
        inventory.add(new Book(11, "978-0140449136", "The Odyssey", "", false));
        inventory.add(new Book(12, "978-0345339683", "The Hobbit", "Bilbo Baggins", true));
        inventory.add(new Book(13, "978-0679720201", "The Stranger", "", false));
        inventory.add(new Book(14, "978-0553213110", "Frankenstein", "", false));
        inventory.add(new Book(15, "978-0141439556", "Wuthering Heights", "Heathcliff", true));
        inventory.add(new Book(16, "978-0307474278", "The Da Vinci Code", "", false));
        inventory.add(new Book(17, "978-0441172719", "Dune", "Paul Atreides", true));
        inventory.add(new Book(18, "978-0743247542", "The Glass Castle", "", false));
        inventory.add(new Book(19, "978-1501142970", "The Seven Husbands of Evelyn Hugo", "", false));
        inventory.add(new Book(20, "978-0525559474", "The Midnight Library", "Nora Seed", true));
    }

    public  void showCheckedOutBooks() {

        for (Book book : inventory){
            if (book.isCheckedOut()){
                IO.println(book);
            }
        }


    }

    public  void showAvailableBooks() {

        for (Book book : inventory){
            IO.println(book);
        }
    }

    private void setBookHeader(){

    }
}
