package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static boolean runFlag = true;
    static void main() {

      ;
        Library library = new Library();
        while (runFlag){
            UI.setMessage("Use the number to make your selection", false);

          String userInput =   UI.getUserInput("Available Choices: \n" +
                    "1) Show Available Books \n" +
                    "2) Show Checked Out Books \n" +
                  "5) Exit \n" +
                  "Make Selection: "
            ).toLowerCase();

            switch(userInput){
                case "1" -> library.showAvailableBooks();
                case "2" -> library.showCheckedOutBooks();
                case "3" -> library.checkOutBook();
                case "5" -> endProgram();
            }


        }


    }

    public static void endProgram(){
        runFlag = false;
        IO.println("Have a good day, come back again!");
    }
}
