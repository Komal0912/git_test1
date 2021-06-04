package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!" ;

    private final String message1="Changes made in the string!!!";


    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getMessage1());
    }

    private final String getMessage() {
        return message;
    }
     private final String getMessage1() {
        return message1;
    }

}
