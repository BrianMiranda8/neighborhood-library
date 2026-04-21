package org.example;

import java.util.Scanner;

public class UI {
    final static String PURPLE = "\u001B[35m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    final static String RESET = "\u001B[0m";

    public static String getUserInput(String msg){
        IO.print(RED+msg+RESET);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().strip().toLowerCase();
    }

    public static void setMessage(String msg,boolean sameLine){
        if (!sameLine) {
             System.out.println(PURPLE + msg + RESET );
        }else {
            System.out.print(PURPLE + msg  + RESET);
        }
    }

    public static void setHeader(String[] headers){

        for (String header : headers){
            IO.print(header + " | ");
        }

    }

}
