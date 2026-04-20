package org.example;

import java.util.Scanner;

public class UI {

    public static String getUserInput(String msg){
        IO.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().strip().toLowerCase();
    }

    public static void setMessage(String msg,boolean sameLine){
        if (!sameLine) {
            System.out.println(msg);
        }else {
            System.out.print(msg);
        }
    }

    public static void setHeader(String[] headers){

        for (String header : headers){
            IO.print(header + " | ");
        }

    }

}
